//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}



// } Driver Code Ends

class Solution{
    static int maxSum(int nums[]){
        int res = nums[0];
        int maxEnding = nums[0];
        for(int i=1;i<nums.length;i++){
            maxEnding = (int)Math.max(nums[i], nums[i]+maxEnding);
            res = (int)Math.max(res, maxEnding);
        }
        return res;
    }
    static int circularSubarraySum(int a[], int n) {
        int maxNormal = maxSum(a);
        if(maxNormal < 0)
            return maxNormal;
        
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
            a[i] = -a[i];
        }
        
        int maxCircular = sum + maxSum(a);
        
        return (int)Math.max(maxNormal,maxCircular);
    }
}

