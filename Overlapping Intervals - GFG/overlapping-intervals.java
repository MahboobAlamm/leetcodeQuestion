//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] intervals)
    { 
        Arrays.sort(intervals, (a,b)->(a[0]-b[0]));
        
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        
        int beg = intervals[0][0];
        int end = intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] <= end){
                end = (int) Math.max(end, intervals[i][1]);
            }
            else {
                arr.add(beg);
                arr1.add(end);
                beg = intervals[i][0];
                end = intervals[i][1];
            }
        }
        arr.add(beg);
        arr1.add(end);
        
        int res[][] = new int[arr.size()][2];
        for(int i=0;i<arr.size();i++){
            res[i][0] = arr.get(i);
            res[i][1] = arr1.get(i);
        }
        
        return res;
    }   
}