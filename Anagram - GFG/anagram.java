//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    public static boolean isSame(int[] a, int[] b){
        for(int i=0;i<256;i++){
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
    public static boolean isAnagram(String a,String b)
    {
        if(a.length() != b.length())
            return false;
            
        int c[] = new int[256];
        int d[] = new int[256];
        for(int i=0;i<a.length();i++){
            c[a.charAt(i)]++;
            d[b.charAt(i)]++;
        }
        
        return isSame(c, d);
        
    }
}