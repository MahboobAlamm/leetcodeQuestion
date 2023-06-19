//{ Driver Code Starts
import java.util.*;


class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queue g = new Queue();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.enqueue(a);
				}
				else if(QueryType == 2)
				System.out.print(g.dequeue()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends


class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 

    int dequeue()
    {
	    while(input.isEmpty()==false){
	        int y = input.pop();
	        output.push(y);
	    }
	    if(output.size()==0){
	        return -1;
	    } else {
	        int y = output.pop();
	        while(output.isEmpty()==false){
	            int z= output.pop();
	            input.push(z);
	        }
	        return y;
	    }
    }
	
    void enqueue(int x)
    {
	    input.push(x);
    }
}

