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


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        int chr[] = new int[256];
        Arrays.fill(chr, -1);
        
        int res = 0;
        int curr = 0;
        for(int i=0;i<S.length();i++){
            curr = Math.max(curr, chr[S.charAt(i)]+1);
            
            int maxEnding = i - curr + 1;
            res = Math.max(res , maxEnding);
            chr[S.charAt(i)] = i;
        }
        
        return res;
    }
}