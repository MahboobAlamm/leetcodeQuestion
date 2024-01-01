//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
// } Driver Code Ends

class Solution
{
    public static boolean find3Numbers(int arr[], int n, int x) { 
    
       Arrays.sort(arr);
       for(int i=0;i<n-2;i++){
           if(i>0 && arr[i] == arr[i-1])
                continue;
            int low = i+1;
            int high = n-1;
            while(low < high){
                if(arr[i]+arr[low]+arr[high] == x)
                    return true;
                else if(arr[i]+arr[low]+arr[high] > x){
                    high--;
                } else {
                    low++;
                }
            }
       }
       return false;
    }
}
