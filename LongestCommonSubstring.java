/*
Longest common sub-string
Dynamic programming approach
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LongestCommonSubstring {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2= sc.nextLine();
        
        int[][] mat = new int[s1.length()+1][s2.length()+1];
        int maxLength=0;
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    mat[i][j]=1+mat[i-1][j-1];
                
                    if(maxLength<mat[i][j])
                        maxLength=mat[i][j];
                }                
                
            }
        }
        
        System.out.println(maxLength);
    }
}
