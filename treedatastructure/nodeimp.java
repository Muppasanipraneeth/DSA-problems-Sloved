public class nodeimp{
    public static class Node{
        int data;
        Node right;
        Node left;
        public  Node(int data){
            this.data=data;
        }
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
       int ans= height(root);
       System.out.println(ans);

    }
    private static int height(Node root) {
     if(root==null){
        return 0;
     }
     int lh=height(root.left);
     int rh=height(root.right);
     return Math.max(lh,rh)+1;
    }
}