/*
 * Given a non-negative number represented as an array of digits,
add 1 to the number ( increment the number represented by the digits ).
The digits are stored such that the most significant digit is at the head of the list.

Example:
If the vector has [1, 2, 3]
the returned vector should be [1, 2, 4]
as 123 + 1 = 124.

Note : Handle zeroes at MSB. 
e.g. [0,1,2,3] + 1 should be [1,2,4]
 * 
 */

import java.util.ArrayList;

public class AddOneToNumber {
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	
	    int lastIndex=-1;
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    for(int i=0;i<a.size();i++){
	        if(a.get(i)!=9){
	            lastIndex=i;
	        }
	    }
	    
	    if(lastIndex==-1){
	    	int index=1;
	        result.add(1);
	        for(int i=0;i<a.size();i++)
	        	result.add(index++,0);
	    }
	    
	    else if(lastIndex==a.size()-1){
	    	result.addAll(a);
	    	int ans= result.get(a.size()-1);
	    	result.remove(a.size()-1);
	    	result.add(ans+1);
	    }
	    else{
	    	
	    	for(int i=0;i<=lastIndex;i++){
	    		result.add(i, a.get(i));
	    	}
	    	int ans= result.get(result.size()-1);
	    	result.remove(result.size()-1);
	    	result.add(ans+1);
	    	
	    	for(int i=lastIndex+1;i<a.size();i++)
	    		result.add(i,0);
	    	
	    }
	    
	    //remove zeros
	    int index=0;
	    for(int i=0;i<result.size();i++){
	        if(result.get(index++)!=0)
	            break;
	    }
	    ArrayList<Integer> finalResult = new ArrayList<Integer>();
	        for(int i=index-1;i<result.size();i++)
	        	finalResult.add(result.get(i));
	    
	    return finalResult;
	    
	}
	
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(0);
		input.add(0);
		input.add(9);
		input.add(9);
		input.add(9);
		ArrayList result =plusOne(input);
		
		 for(int i=0;i<result.size();i++){
			 	System.out.print(result.get(i)+" ");
		    }
	}
}
