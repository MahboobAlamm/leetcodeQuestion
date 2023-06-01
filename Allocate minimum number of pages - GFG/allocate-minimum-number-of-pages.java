//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    public static boolean isfeasible(int nums[], int n , int m, int ans){
        int req = 1; int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i] > ans){
                req++;
                sum = nums[i];
            }
            else{
                sum += nums[i];
            }
        }
        return req <= m;
    }
    public static int findPages(int[]nums,int n,int m)
    {
        if(m>n)
            return -1;
        int max = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            max = Math.max(max, nums[i]);
        }
        
        int low = max, high = sum, res = 0;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(isfeasible(nums, n, m, mid)){
                res = mid;
                high = mid-1;
            }
            else {
                low = mid +1;
            }
        }
        return res;
    }
};