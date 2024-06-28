import java.util.ArrayList;

public class linkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class LinkedList {
        static Node head;

        LinkedList() {
            this.head = null;

        }

        public void add(int data) {
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public void print() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "->>");
                current = current.next;
            }
            System.out.println();
        }

        public static int sum(linkedlist.LinkedList n1, linkedlist.LinkedList n) {
            Node head1 = n1.head;
            Node head2 = n.head;
            int sum = 0;
            Node current1 = head1;
            Node current2 = head2;
            int carry = 0;
            while (current1 != null && current2 != null) {
                int currentsum = 0;

                currentsum = current1.data + current2.data;
                if (currentsum < 10) {
                    sum = sum * 10 + currentsum + carry;
                    carry = 0;
                }
                if (currentsum == 10) {
                    sum = sum * 10 + carry;
                    carry = 1;

                }
                if (currentsum > 10) {

                    sum = sum * 10 + currentsum % 10 + carry;
                    carry = currentsum / 10;

                }
                current1 = current1.next;
                current2 = current2.next;

            }
            while (current1 != null) {
                sum = sum * 10 + current1.data + carry;

                carry = current1.data / 10;
                current1 = current1.next;

            }
            while (current2 != null) {

                sum = sum * 10 + current2.data + carry;

                carry = current2.data / 10;
                current2 = current2.next;
            }
            sum = reversing(sum);
            return sum;
        }

        private static int reversing(int sum) {
            int num = 0;
            while (sum != 0) {
                int temp = sum % 10;
                num = num * 10 + temp;
                sum = sum / 10;
            }

            return num;
        }

        public void removemiddle() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            System.out.println(count);

            int n = count / 2;
            int m = 0;
            Node temp2 = head;
            while (m + 1 != n) {
                m++;
                temp2 = temp2.next;

            }
            temp2.next = temp2.next.next;

        }

        public linkedlist.Node even() {

            Node even = head;

            while (even != null && even.next != null) {
                even = even.next.next;
            }
            return even;

        }

        public void reverse(int i, int j) {
            Node temp = head;
            while (temp.data != i) {
                temp = temp.next;

            }
            Node prev = null;
            Node current = temp;
            Node next;
            while (current != null) {

                next = current.next;
                current.next = prev;
                prev = current;
                if (current.data == j) {
                    break;
                }
                current = next;

            }
            temp.next = current;

        }

    }

    public static void main(String[] args) {
        LinkedList n = new LinkedList();// [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        n.add(5);
        n.add(4);
        n.add(3);
        n.add(2);
        n.add(1);
        // n.add(3);
        // n.add(2);
        // n.add(1);
        n.print();
        n.reverse(2, 4);
        n.print();
        Node k = n.head.next.next;
        removing(k);
        // n.print();
        // n.removemiddle();

        // n.print();
        // [1,3,4,7,1,2,6

        // LinkedList n1 = new LinkedList();
        // n1.add(9);
        // n1.add(9);
        // n1.add(9);
        // n1.add(9);

        // n1.print();
        // n.print();
        // int ans = LinkedList.sum(n1, n);
        // System.out.println(ans);
    }

    private static void removing(linkedlist.Node k) {
        Node temp = k;
        int data = k.data;
        ArrayList<Integer> p = new ArrayList<>();
        while (temp != null) {

        }
    }

}
