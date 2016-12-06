/*
Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(0);
		input.add(0);
		input.add(0);
		input.add(0);
		input.add(0);
		
		System.out.println(largestNumber(input));
		
	}
	
	
	public static String largestNumber(final List<Integer> a) {
        String ans="";
        String[] input = new String[a.size()];
        for(int i=0;i<a.size();i++){
            input[i]=""+a.get(i);
        }
        
        Arrays.sort(input,new myCompare());
        StringBuffer sb = new StringBuffer();
        int i=0;
        
        //handling all zero condition where we need to return 0 instead of 000000.....
        while(i<input.length){
        	if(Integer.parseInt(input[i])==0){
        		i++;
        		//break;
        	}
        	else
        		break;
        }
        if(i==input.length)
        	return ""+0;
        
        for(;i<input.length;i++){
        	
        	
        	sb.append(input[i]);
        }
        
        return sb.toString();
        //return ans;
        
}

}


class myCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		
		String ab=s1+s2;
		String ba=s2+s1;
		
		//if(ab.compareTo(ba))
		
		//return ab.compareTo(ba);
		if(ab.equals(ba))
			return 0;
	
		else if(ab.compareTo(ba)<0)
			return 1;
		
		else
			return -1;
	}
	
	
	
}
