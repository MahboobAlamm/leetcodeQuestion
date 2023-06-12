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
            String str = br.readLine().trim();
            Solution obj = new Solution();
            long ans = obj.findRank(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    long factorial(int n){
        long fact = 1;
        for(int i = 2;i<=n;i++){
            fact = fact*i;
        }
        
        return fact;
    }
    public long findRank(String s)
    {
        int n = s.length();
        int chr[] = new int[256];
        for(int i=0;i<n;i++){
            chr[s.charAt(i)]++;
        }
        
        for(int i=1;i<256;i++){
            chr[i] = chr[i]+chr[i-1];
        }
        
        
        long mul = factorial(n);
        
        long res = 1;
        for(int i=0;i<n-1;i++){
            mul = mul / (n-i);
            
            res += chr[s.charAt(i)-1] * mul;
            
            for(int j=s.charAt(i);j<256;j++){
                chr[j]--;
            }
        }
        return res;
    }
}