//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int start[], int end[], int n)
    {
        // add your code here
        Arrays.sort(start);
        Arrays.sort(end);
        // for(int x: start){
        //     System.out.print(x+" ");
        // }
        // System.out.println();
        // for(int y: end){
        //     System.out.print(y+" ");
        // }
        // System.out.println();
        int i=1;
        int j=0;
        int res = 1;
        int curr = 1;
        while(i<n && j < n){
            // System.out.println(start[i]+" ,, "+ end[j]);
            if(start[i] <= end[j]){
                curr++;
                i++;
            } else {
                curr--;
                j++;
            }
            res = Math.max(res, curr);
            // System.out.println(curr + " - " + res);
        }
        return res;
        
    }
    
}

