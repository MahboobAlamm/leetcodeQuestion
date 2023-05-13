//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends
class Solution{
    static long trappingWater(int arr[], int n) { 
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        
        lmax[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            lmax[i] = (int)Math.max(lmax[i-1], arr[i]);
        }
        
        rmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i] = (int)Math.max(rmax[i+1], arr[i]);
        }
        
        long res=0;
        for(int i=1;i<n-1;i++){
            res += (long)Math.min(lmax[i], rmax[i]) -arr[i];
        }
        
        return res;
    } 
}


