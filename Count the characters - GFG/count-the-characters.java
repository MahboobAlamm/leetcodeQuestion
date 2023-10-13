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
            String s = sc.next ();
            int n = sc.nextInt();

    		System.out.println (new Sol().getCount (s, n)); 
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int getCount (String s, int N)
    {
        Map<Character, Integer> mp = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(i !=0 && s.charAt(i) == s.charAt(i-1))
                continue;
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }
        
        int res = 0;
        
        for(Map.Entry<Character, Integer> e : mp.entrySet()){
            if(e.getValue() == N){
                res++;
            }
        }
        
        return res;
    }
}