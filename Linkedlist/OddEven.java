public class OddEven {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;

    public void add(int data) {
        Node newnode = new Node(data);
        if (Head == null) {
            Head = newnode;
            Tail = newnode;
            return;
        }
        Tail.next = newnode; 
        Tail = newnode;
    }

    public void print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void oddeven() {
        if (Head == null || Head.next == null) {
            return; 
        }

        Node odd = Head;
        Node even = Head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead; 
    }

    public static void main(String[] args) {
        OddEven ll = new OddEven();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        System.out.println("Original List:");
        ll.print();

        oddeven(); 

        System.out.println("After Odd-Even rearrangement:");
        ll.print();
    }
}
