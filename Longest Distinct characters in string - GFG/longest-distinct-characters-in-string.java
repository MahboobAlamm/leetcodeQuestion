//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends

class Solution{
    static int longestSubstrDistinctChars(String str){
        int n = str.length();
        int i=0;
        int res = 0;
        
        int prev[] = new int[256];
        Arrays.fill(prev, -1);
        
        for(int j=0;j<n;j++){
            i = Math.max(i, prev[str.charAt(j)]+1);
            
            int maxEnd = j-i+1;
            res = Math.max(res, maxEnd);
            
            prev[str.charAt(j)] = j;
        }
        
        return res;
    }
}