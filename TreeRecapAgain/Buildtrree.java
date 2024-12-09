package TreeRecapAgain;


import java.util.ArrayList;
import java.util.List;

public class Buildtrree {
    public  static class Node{
        int data;
        Node left;
        Node right;
      public   Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int nums[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        Node root=populate(nums);
        inorder(root);
        List<Integer> list2= inorderTraversal(root);
        System.out.println(list2);

    }
    public  static  List<Integer> inorderTraversal(Node root){
       List<Integer> list=new ArrayList<>();
       inorderlist(root,list);
       return list;
    }
    public  static void inorderlist(Node root,List<Integer> list){
        if(root==null){
            return;

        }
        inorderlist(root.left,list);
        list.add(root.data);
        inorderlist(root.right,list);

    }
    public  static  void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data );
        inorder(root.right);
    }
    public static Node populate(int[] nums){
        return populatetree(nums,0,nums.length-1);
    }
    public static Node populatetree(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(nums[mid]);
        root.left=populatetree(nums,start,mid-1);
        root.right=populatetree(nums,mid+1,end);
        return root;
    }

}
