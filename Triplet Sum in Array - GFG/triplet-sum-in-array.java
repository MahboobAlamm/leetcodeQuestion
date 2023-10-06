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
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1])
                continue;
            
            int beg = i+1;
            int end = n-1;
            
            while(beg < end){
                if(end < n-1 && arr[i] == arr[i+1]){
                    end--;
                    continue;
                }
                
                if(arr[i] + arr[beg] + arr[end] == x){
                    ArrayList<Integer> s = new ArrayList<>();
                    s.add(arr[i]); s.add(arr[beg]); s.add(arr[end]);
                    a.add(s);
                    beg++; 
                    end--;
                }
                else if(arr[i] + arr[beg] + arr[end] > x){
                    end--;
                }
                else{
                    beg++;
                }
            }
        }
        return a.size()>0;
    }
}
