import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reversequeue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        Queue<Integer>q=new LinkedList<>();
    
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("enter the k value");
        int k=sc.nextInt();
        q=modifyQueue(q,k);
        System.out.println(q);
        
       
    } public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer>s=new Stack<>();
        Deque<Integer>result=new LinkedList<>();
        for (int i = 0; i <k; i++) {
            s.add(q.remove());
        }
        while (!s.isEmpty()) {
            result.add(s.pop());
            
        }
        while (!q.isEmpty()) {
            result.addLast(q.remove());
        }
        System.out.println(result);
        return result;
        // add code here.
    }
}
