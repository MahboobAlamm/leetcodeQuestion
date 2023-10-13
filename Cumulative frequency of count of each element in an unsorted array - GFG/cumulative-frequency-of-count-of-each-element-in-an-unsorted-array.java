//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> v;
		    v = obj.countFreq(arr,n);
            for(int i : v)
                System.out.print(i+" ");
		    System.out.println();
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public ArrayList<Integer> countFreq(int[] a, int n)  
    { 
        Map<Integer, Integer> mp = new TreeMap<>();
        
        for(int i=0;i<n;i++){
           mp.put(a[i], mp.getOrDefault(a[i],0)+1);
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int sum = 0;
        for(Map.Entry<Integer, Integer> e : mp.entrySet()){
            sum += e.getValue();
            arr.add(sum);
        }
        
        return arr;
    }  
      
}

