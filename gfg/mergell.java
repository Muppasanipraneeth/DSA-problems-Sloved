import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class mergell {
    // mege two linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

    }

    public static mergell.Node head;

    public static void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        mergell ll = new mergell();
        ll.add(7);
        ll.add(10);
        ll.add(7);
        ll.add(7);
        // ll.add(7);
        // ll.add(6);
        // ll.add(5);
        // ll.add(4);
        // ll.add(2);
        // ll.add(2);
        // ll.add(1);

        ll.display();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the k value");
        // int k = sc.nextInt();
        // ll.reversekth(k);
        ll.display();
        // ll.removedup();
        ll.display();
        // LinkedList: 1->2->2->4->5->6->7->8
        int x=1;
      Node k=  deletnode(head,x);
        display(k);
    }

    private static Node deletnode(Node head, int x) {
        int size=1;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        System.out.println(size);
        temp=head;
        int count=1;
        while (count<size) {
            if(x==count){
                temp=temp.next;
            }
            temp=temp.next;
            count++;
            
        }
        return head;
     
    }

    private static void display(Node k) {
        Node temp=k;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
      
    }

    private void removedup() {
       ArrayList<Integer>set=new ArrayList<>();
       Node temp=head;
       Node prev=null;
       while (temp!=null) {
        if(set.contains(temp.data)){
            prev.next=temp.next;
        }else{
            
            prev=temp;
        }
        set.add(temp.data);
        temp=temp.next;
        
       }
    }

    private void reversekth(int k) {
        Node temp = head;
        int size=0;
        while (temp!=null) {
            temp=temp.next;
            size++;
            
        }

        int count = -1;
        Node prev = null;
        Node Next;
        Node current = head;

        while (current != null) {
            if (count == k) {

                break;

            }
            Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
            count = count + 1;

        }
        // head=current;
        Node prev1 = null;
        Node Next1;
        Node current1 = current;

        while (current1 != null) {

            Next1 = current1.next;
            current1.next = prev1;
            prev1 = current1;
            current1 = Next1;

        }
        head = prev;
        while (prev.next != null) {
            prev = prev.next;

        }
        prev.next = prev1;

    }
}
