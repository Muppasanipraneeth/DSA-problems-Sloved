import java.util.HashSet;

class sumoftwo{
  public static   class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Linkedlist{
        public Node head;
        public Node tail;
        public void addLast(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
            }
            tail.next=newnode;
            tail=newnode;
        }
    public void add(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=tail=newnode;
            return ;
        }
        newnode.next=head;
        head=newnode;

    }
    
    public void printing(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void addindex(int data, int index) {
        Node newnode=new Node(data);
        if(index==0){
            add(data);
            return ;
        }
        int i=0;
        Node temp=head;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
      newnode.next=temp.next;
      temp.next=newnode;

    }
    public Node removeduplicates(){
        HashSet<Integer>s=new HashSet<>();
        Node temp=head;
        Node  prev=null;
        while(temp.next!=null){
            if(s.contains(temp.data)){
                prev=temp.next;
            }else{
                prev=temp;
            }
            s.add(temp.data);
            temp=temp.next;
        }
        return head;
    }
}
    public static void main(String args[]){
        Linkedlist l=new Linkedlist();
     
     l.add(0);
     l.add(1);
     l.add(2);
     l.add(3);
     l.add(4);
     l.printing();
     Linkedlist l1 =new Linkedlist();
     l1.add(0);
     l1.add(1);
    //  l1.add(5);
     l1.add(3);
     l1.add(4);
     l1.printing();
     boolean ans=isSame(l,l1);
     System.out.println(ans);
    }
    private static boolean isSame(Linkedlist l, Linkedlist l2) {
        Node temp1=l.head;
        Node temp2=l2.head;
        while(temp1!=null && temp2!=null){
            if(temp1.data!=temp2.data){
                return false;

            }
            temp1=temp1.next;
            temp2=temp2.next;

        }
        if(temp1!=null || temp2!=null){
            return false;
        }
        return true;
        
    }
}