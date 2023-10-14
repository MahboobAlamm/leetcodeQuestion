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


// User function Template for Java

class Solution {
    boolean isSame(int a[], int b[]){
        for(int i=0;i<256;i++){
            if(a[i] != b[i])
                return false;
        }
        
        return true;
    }

    int search(String pat, String txt) {
        int ct[] = new int[256];
        int cp[] = new int[256];
        
        if(pat.length() > txt.length())
            return 0;
            
        for(int i=0;i<pat.length();i++){
            ct[txt.charAt(i)]++;
            cp[pat.charAt(i)]++;
        }
        int count = 0;
        for(int i = pat.length(); i< txt.length(); i++){
            if(isSame(ct, cp))
                count++;
                
            ct[txt.charAt(i)]++;
            ct[txt.charAt(i-pat.length())]--;
        }
        if(isSame(ct,cp))
            count++;
        
        return count;
    }
}