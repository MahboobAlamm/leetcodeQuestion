//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrixA = new int[n][n];
            int[][] matrixB = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrixA[i][j] = Integer.parseInt(S[j]);
            }
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrixB[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            ob.Multiply(matrixA, matrixB);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void  Multiply(int[][] matrixA, int[][] matrixB)
    {
        int r = matrixA.length;
        int c = matrixB.length;
        
        int r2 = matrixB.length;
        int ans[][] = new int[r][c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int res = 0;
                for(int k = 0;k < r2;k++){
                    res += matrixA[i][k] * matrixB[k][j];
                }
                ans[i][j] = res;
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrixA[i][j] = ans[i][j];
            }
        }
    }
}