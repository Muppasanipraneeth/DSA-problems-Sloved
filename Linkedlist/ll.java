public class ll {
    public class Node{
        int data;
        Node next;
      public   Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public  void add(int data){
        Node newnode=new Node(data);
        if(Head==null){
            Head=newnode;
            Tail=newnode;
            return ;

        }
        Node temp=Head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        Tail=newnode;
    }
    public void Print(){
        if(Head==null){
            System.out.println(" this linked list is empty");
            return ;
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }
    public static  void altnode(){
        if(Head==null){
            return;
        }
        Node temp=Head;
        while(temp!=null && temp.next!=null){
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return;
    }
    public static void main(String args[]){

        ll list = new ll();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.Print();
        altnode();
        list.Print();


    }
}
