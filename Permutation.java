/*
Find all parmutation of a given string
*/

import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch = new char[4];
		ch[0]='a';
		ch[1]='b';
		ch[2]='a';
		ch[3]='a';
		//ch[3]='4';
		//ch[4]='1';
		//ch[5]='1';
		int r=3;
		boolean[] bool = new boolean[ch.length];
		char[] ans = new char[r];
		int index=0;
		
		
		//not handle repetitive char. 
		//findPermutation(ch,ans,bool,r,0);

		//sort the array before calling the function if you want to handle repetitive char
		Arrays.sort(ch);
		findPermutation1(ch,ans,bool,r,0);
	}
	
	//not handle repetitive char. 
		public static void findPermutation(char[] ch, char[] ans, boolean[] bool, int r,int level){
			
			if(level==r){
				//print the array
				for(int i=0;i<r;i++)
					System.out.print(ans[i]+" ");
				
				System.out.println("");
				
				return;
			}
			if(level>r)
				return;
			
			for(int i=0;i<bool.length;i++){
				if(bool[i]==false){
					bool[i]=true;
					ans[level]=ch[i];
					findPermutation(ch,ans,bool,r,level+1);
					bool[i]=false;
				}
			}
			
			
		}
		
		//handle repetitive char
		public static void findPermutation1(char[] ch, char[] ans, boolean[] bool, int r,int level){
			char prev='$';
			//System.out.print(" %%% ");
			
			if(level==r){
				//print the array
				for(int i=0;i<r;i++)
					System.out.print(ans[i]+" ");
				
				System.out.println("");
				
				return;
			}
			if(level>r)
				return;
			
			
			for(int i=0;i<ch.length;i++){
				//System.out.print(" >> "+ch[i]+" ## "+dindex);
				if(bool[i]==false && prev!=ch[i]){
					bool[i]=true;
					ans[level]=ch[i];
					findPermutation1(ch,ans,bool,r,level+1);
					bool[i]=false;
					prev=ch[i];
				}
				
			}
			
		}

}
