/*
Coin Change Problem
Given Sum and Set of coins find minimum change require for given sum

ex. Set = [2,4,5,6,8] and Sum=11
 output = 11
 
 6+5 = 11


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CoinChange2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
		
		int sum= sc.nextInt();
        int len = sc.nextInt();
        int[] s = new int[len];
        for(int i=0;i<len;i++)
            s[i]=sc.nextInt();
        
        long[][] mat = new long[s.length+1][sum+1];
        
        for(int i=0;i<sum+1;i++)
        		mat[0][i]=Integer.MAX_VALUE;
        
        for(int i=1;i<=len;i++){
            for(int j=0;j<=sum;j++){
            	
            	
                if(j==0)
                    mat[i][j]=0;
                
                else if(j>=s[i-1])
                    mat[i][j]=Math.min(mat[i-1][j],1+mat[i][j-s[i-1]]);
                
                else
                    mat[i][j]=mat[i-1][j];
                    
                    
            }
            
        }
        
        System.out.println(mat[s.length][sum]);
        
        
    }
}