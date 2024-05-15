import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.Stack;
import java.util.*;

public class Implementing{
    public static class Node{
        int data;
        Node right;
        Node left;
        public Node (int data){
            this.data=data;

        }
    }
    public static class binarytree {
    static int ind=-1;
    public static Node buildtree(int []array){
        ind++;
        if(array[ind]==-1){
            return null;
        }
        Node newnode=new Node(array[ind]);
        newnode.left=buildtree(array);
        newnode.right=buildtree(array);
        return newnode;
    }
    public void preorder(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
       
    }
    public void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
       
    }
    public void postorder(Implementing.Node root) {
       if(root==null){
        return;
       }
       postorder(root.left);
       postorder(root.right);
       System.out.print(root.data+" ");
    }
    public void levelorder(Node root) {
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null){
            System.out.println(" this root is null");
            return ;
        }
    Queue<Node>s=new LinkedList();
    s.add(root);
        while (!s.isEmpty()) {
            Node currNode=s.remove();
            if(currNode.left!=null){
                s.add(currNode.left);
            }
            if(currNode.right!=null){
                s.add(currNode.right);
            }            list.add(currNode.data);

            
        }
        System.out.println(list);
       
      
    }

        
    } 
    public static void main(String[] args) {
        binarytree tree=new binarytree();
        int []array={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=tree.buildtree(array);
        System.out.println("preorder traversal");
        tree.preorder(root);
        System.out.println();
        System.out.println("Inorder traversal");
        tree.inorder(root);   
        System.out.println();     
        System.out.println("preorder traversal");
        tree.postorder(root);
        System.out.println();
        System.out.println("level order traversal");
        tree.levelorder(root);
    }
    
}