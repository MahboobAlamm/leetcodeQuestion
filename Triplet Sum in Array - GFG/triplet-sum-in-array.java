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
    public static boolean find3Numbers(int nums[], int n, int X) { 
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            int beg = i+1;
            int end = nums.length-1;
            while(beg<end){
                if(end!=nums.length-1 && nums[end]==nums[end+1]){
                    end--;
                    continue;
                }
                if(nums[i]+nums[beg]+nums[end]==X)
                    return true;
                else if(nums[i]+nums[beg]+nums[end] > X)
                    end--;
                else
                    beg++;
            }
        }
        return false;
    }
}
