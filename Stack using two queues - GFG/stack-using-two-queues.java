//{ Driver Code Starts
import java.util.*;


class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queues g = new Queues();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends
class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push(int a)
    {
	    q1.add(a);
    }
    
    int pop()
    {
        if(q1.size()==0){
            return -1;
        }
	    while(q1.size() > 1){
	        int x = q1.poll();
	        q2.add(x);
	    }
	    int res = q1.poll();
	    
	    while(!q2.isEmpty()){
	        int save = q2.poll();
	        q1.add(save);
	    }
	    return res;
    }
	
}

