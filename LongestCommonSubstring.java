/*
Longest common sub-sequence
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
        
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    mat[i][j]=1+mat[i-1][j-1];
                else
                    mat[i][j]=Math.max(mat[i-1][j],mat[i][j-1]);
                
            }
        }
        
        System.out.println(mat[s1.length()][s2.length()]);
    }
}