/*
Find all combination of give input.
*/
import java.util.Arrays;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ch = new char[6];
		ch[0]='1';
		ch[1]='2';
		ch[2]='3';
		ch[3]='4';
		ch[4]='1';
		ch[5]='1';
		int r=3;
		char[] ans = new char[r];
		int index=0;
		int dindex=0;
		
		//not handle repetitive char. 
		//findCombination(ch,ans,r,index,0);

		//sort the array before calling the function if you want to handle repetitive char
		Arrays.sort(ch);
		findCombination1(ch,ans,r,index,dindex);
	}
	
	//not handle repetitive char. 
	public static void findCombination(char[] ch, char[] ans, int r, int index, int dindex){
		
		if(dindex==r){
			//print the array
			for(int i=0;i<r;i++)
				System.out.print(ans[i]+" ");
			
			System.out.println("");
			
			return;
		}
		if(dindex>r)
			return;
		
		for(int i=index;i<ch.length;i++){
			ans[dindex]=ch[i];
			findCombination(ch,ans,r,i+1,dindex+1);
		}
		
		
	}
	
	//handle repetitive char
	public static void findCombination1(char[] ch, char[] ans, int r, int index, int dindex){
		char prev=' ';
		
		if(dindex==r){
			//print the array
			for(int i=0;i<r;i++)
				System.out.print(ans[i]+" ");
			
			System.out.println("");
			
			return;
		}
		if(dindex>r)
			return;
		
		
		for(int i=index;i<ch.length;i++){
			//System.out.print(" >> "+ch[i]+" ## "+dindex);
			if(i==index || prev!=ch[i]){
				ans[dindex]=ch[i];
				findCombination1(ch,ans,r,i+1,dindex+1);
			}
			prev=ch[i];
		}
		
	}

}
