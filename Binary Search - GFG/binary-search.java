//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binary(int arr[], int l, int h, int k){
        if(l>h)
            return -1;
            
        int mid = (l+h)/2;
        
        if(arr[mid] == k)
            return mid;
        else if(arr[mid] > k)
            return binary(arr, l, mid-1, k);
        else
            return binary(arr, mid+1, h, k);
    }
    int binarysearch(int arr[], int n, int k) {
        int l = 0;
        int h = n-1;
        
        return binary(arr, l, h, k);
    }
}