/*
 * 
 * Max sum subArray
 * Input : {-2, -3, 4, -1, -2, 1, 5, -3}
 * Output : 7 [4 + -1 + -2 + 1 + 5]
 * 
 * @Author : Vatsal Rathod
 */

import java.util.List;

public class MaxSumSubarray {
	// DO NOT MODFIY THE LIST. 
	public static int maxSubArray(int[] a) {
	    
	    int max_so_far=a[0],max_here=a[0];
	    for(int i=1;i<a.length;i++){
	        max_here=Math.max(a[i],max_here+a[i]);
	        max_so_far=Math.max(max_so_far,max_here);
	    }
	    return max_so_far;
	    
	}
	
	
	public static void main(String arrgs[]){
		
	int input[]	={97, 0, -461, -125, -404, -59, -322, -495, -288, -341, -449, -313, -192, -214, -389, -202, -183, -72, -416, -455, -187, -242, -416, 39, -198, -338, -465, -248, -25, -398, -97, -461, -214, -423, -407, -77, -190, -67, -178, -410, -160, 72, -350, -31, -85, -247, -319, -462, -303, -48, -354, -110, 17, 60, 19, 80, -218, -28, -426, -366, -140, 50 };
	//expected output = 176
	
	System.out.print(maxSubArray(input));
	
}
}
