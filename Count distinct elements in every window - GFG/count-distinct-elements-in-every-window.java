//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        Map<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i < k;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }
        res.add(mp.size());
        
        for(int i=k;i<n;i++){
            if(mp.get(arr[i-k])==1)
                mp.remove(arr[i-k]);
            else {
                mp.put(arr[i-k], mp.get(arr[i-k])-1);
            }
            
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
            
            res.add(mp.size());
        }
        
        return res;
    }
}

