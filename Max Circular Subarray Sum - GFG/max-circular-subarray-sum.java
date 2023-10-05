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
    static int normalSubarraySum(int arr[], int n){
        int res = arr[0];
        int curr = arr[0];
        
        for(int i=1;i<n;i++){
            curr = Math.max(arr[i], arr[i]+curr);
            res = Math.max(res, curr);
        }
        
        return res;
    }
    
    static int circularSubarraySum(int a[], int n) {
    
        // Your code here
        int max_normal = normalSubarraySum(a,n);
        
        if(max_normal < 0)
            return max_normal;
            
        int sum = 0;
        
        for(int i=0;i<n;i++){
            sum += a[i];
            a[i] = -a[i];
        }
        
        int max_circular = sum + normalSubarraySum(a, n);
        
        return Math.max(max_normal, max_circular);
        
    }
    
}

