//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Solution {
    boolean areSame(int x[], int y[]){
        for(int i=0;i<x.length;i++){
            if(x[i]!=y[i])
                return false;
        }
        return true;
    }

    int search(String pat, String txt) {
        if(pat.length() > txt.length()){
            return -1;
        }
        int patt[] = new int[265];
        int txtt[] = new int[265];
        
        for(int i=0;i<pat.length();i++){
            patt[pat.charAt(i)]++;
            txtt[txt.charAt(i)]++;
        }
        int count=0;
        
        for(int i=pat.length();i<txt.length();i++){
            if(areSame(patt, txtt)){
                count++;
            }
            txtt[txt.charAt(i-pat.length())]--;
            txtt[txt.charAt(i)]++;
        }
        
        if(areSame(txtt, patt)){
            count++;
        }
        
        return count;
    }
}