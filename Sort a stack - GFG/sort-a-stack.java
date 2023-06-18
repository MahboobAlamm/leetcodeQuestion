//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public void insertAtRightPos(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        } else if(st.peek() < x){
            st.push(x);
        } else {
            int a = st.pop();
            insertAtRightPos(st, x);
            st.push(a);
        }
    }
	public Stack<Integer> sort(Stack<Integer> st)
	{
		if(st.isEmpty()==false){
		    int x = st.pop();
		    sort(st);
		    insertAtRightPos(st, x);
		}
		
		return st;
	}
}