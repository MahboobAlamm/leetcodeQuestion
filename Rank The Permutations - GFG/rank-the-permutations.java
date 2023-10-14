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

class Solution
{
    public long fact(int n){
        long res = 1;
        for(int i=1;i<=n;i++){
            res = res * i;
        }
        return res;
    }
    public long findRank(String str)
    {
        long res =0;
        int n =str.length();
        long mul = fact(n);
        int count[] = new int[256];
        
        for(int i=0;i<n;i++){
            count[str.charAt(i)]++;
        }
        for(int i=1;i<256;i++){
            count[i] = count[i]+ count[i-1];
        }
        
        for(int i=0;i<n-1;i++){
            mul = mul/(n-i);
            res += count[str.charAt(i)-1] * mul;
            for(int j = str.charAt(i); j< 256;j++){
                count[j]--;
            }
        }
        
        return res + 1;
    }
}