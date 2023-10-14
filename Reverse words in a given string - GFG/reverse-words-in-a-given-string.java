//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    String reverseWords(String S)
    {
        String str[] = S.split("\\.");
        int i = 0;
        int j = str.length-1;
        
        while(i<j){
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        
        String res="";
        
        for(int k = 0;k<str.length-1;k++){
            res += str[k]+".";
        }
        
        return res+str[str.length-1];
    }
}