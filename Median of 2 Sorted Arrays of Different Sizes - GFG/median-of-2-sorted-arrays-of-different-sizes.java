//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n1, int n2, int a1[], int a2[]) 
    {
        if(n1>n2)
            return medianOfArrays(n2, n1, a2, a1);
            
        int beg = 0;
        int end1 = n1;
        
        while(beg <= end1){
            int i1 = (beg + end1)/2;
            int i2 = (n1+n2+1)/2 - i1;
            
            int min1 = (i1 == n1) ? Integer.MAX_VALUE : a1[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : a1[i1-1];
            
            int min2 = (i2 == n2) ? Integer.MAX_VALUE : a2[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : a2[i2-1];
            
            if(max1 <= min2 && max2 <= min1){
                if((n1+n2)%2==0)
                    return (((double)Math.max(max1, max2)) + (double)Math.min(min1, min2))/2;
                else
                    return (double)Math.max(max1, max2);
            }
            else if(max1 > min2){
                end1 = i1-1;
            }
            else {
                beg = i1+1;
            }
        }
        return -1;
    }
}