//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            
            String a = sc.next();
            String b = sc.next();
            Solution ob = new Solution();
            if(ob.isSubSequence(a,b))
            System.out.println(1);
            else
            System.out.println(0);
 		
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    boolean isSubSequence(String A, String B){
        
        int i = 0;
        int j = 0;
        if(A.length() > B.length())
            return false;
        
        while(i < A.length() && j < B.length()){
            if(A.charAt(i) == B.charAt(j)){
                i++;
            }
            j++;
        }
        
        if(i==A.length())
            return true;
        return false;
    }
}