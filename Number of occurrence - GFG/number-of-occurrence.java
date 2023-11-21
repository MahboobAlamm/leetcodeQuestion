//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class Solution {
    int fir(int[] arr, int n, int x){
        int l = 0;
        int h = n-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] > x){
                h = mid-1;
            } else if(arr[mid] < x){
                l = mid+1;
            }
            else {
                if(mid == 0 || arr[mid]!=arr[mid-1])
                    return mid;
                else{
                    h = mid-1;
                }
            }
        }
        
        return -1;
    }
    int sec(int arr[], int n, int x){
        int l = 0;
        int h =n-1;
        while(l<=h){
            int mid = (l+h)/2;
            
            if(arr[mid] > x){
                h  = mid-1;
            } else if(arr[mid] < x){
                l = mid+1;
            } else{
                if(mid == n-1 || arr[mid] != arr[mid+1])
                    return mid;
                else {
                    l = mid+1;
                }
            }
        }
        
        return -1;
    }
    int count(int[] arr, int n, int x) {
        int first = fir(arr, n, x);
        if(first == -1)
            return 0;
        int second = sec(arr, n ,x);
        return Math.abs(second-first)+1;
    }
}