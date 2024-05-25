import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class trees{
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    
        
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int countnode(Node root){
        if(root==null){
            return 0;
        }
        int lf=countnode(root.left);
        int rt=countnode(root.right);
        return lf+rt+1;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int sd=lh+rh+1;
        return Math.max(ld,Math.max(rd, sd) );
    }
    public static class Info{
        
        int height;
        int diameter;
        public Info(int height, int diameter){
            this.height=height;
            this.diameter=diameter;
        }
    }
    public static Info diameterhei(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info leftinfo=diameterhei(root.left);
        Info rightinfo=diameterhei(root.right);
        int diameter=Math.max(leftinfo.diameter, Math.max(rightinfo.diameter,leftinfo.height+rightinfo.height+1));
        int height=Math.max(leftinfo.height, rightinfo.height)+1;
        return new Info(height, diameter);
    }
    public static ArrayList<Integer>leftveiw (Node root){
        ArrayList<Integer>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer>l=new ArrayList<>();
            int size=q.size();
            
        
            for (int i = 0; i <size; i++) {
                Node current=q.poll();
                l.add(current.data);
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            result.add(l.get(0));

        }
        System.out.println(result);
        return result;
    }
    public static  boolean issubtree(Node root,Node subroot){
        if(root==null){
            return false;

        }
        if(root.data==subroot.data){
           if(isidentical(root,subroot)){

           
            return true;
        }

        }
        return issubtree(root.left, subroot)|| issubtree(root.right,subroot);
    }

    
    private static boolean isidentical(trees.Node root, trees.Node subroot) {
       if(root==null && subroot==null){
        return true;
       }else if(root==null || subroot==null || root.data!=subroot.data){
        return false;
       }
      
       return isidentical(root.right,subroot.right) && isidentical(root.left,subroot.left);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.right=new Node(7);
         root.right.left=new Node(6);
         root.left.left.right=new Node(8);
         int ans=height(root);
         System.out.println("The height of the tree "+ans);
         int nonode=countnode(root);
         System.out.println(" Number of nodes are "+nonode);
         int sumofnodes=sum(root);
         System.out.println(" The sum of the nodes is "+sumofnodes);
        preorder(root);
        System.out.println();

        int dia=diameter(root);
        System.out.println("Diameter of the tree "+dia);
        System.out.println(diameterhei(root).diameter +" this is daimeter "+diameterhei(root).height+" this is height");
    leftveiw(root);
    Node subroot=new Node(2);
    subroot.left=new Node(4);
    subroot.right=new Node(5);
    boolean pk=issubtree(root,subroot); 
    System.out.println(pk);   
    
    }
}