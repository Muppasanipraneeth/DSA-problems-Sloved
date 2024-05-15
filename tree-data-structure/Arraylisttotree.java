import java.util.ArrayList;

public class Arraylisttotree {
    public static class Node {
        int data;
        Node right;
        Node left;
        int height;

        public Node(int data) {
            this.data = data;
            this.height = 1; 
        }

        public int getvalue() {
            return this.data;
        }
    }
 public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();//-10,-3,0,5,9
    list.add(-10);
    list.add(-3);
    list.add(0);
    list.add(5);
    list.add(9);
    int nums[]=new int[list.size()];
    for (int i = 0; i < nums.length; i++) {
        nums[i]=list.get(i);
        
    }
  Node tree=  populate(nums);
  inorder(tree);
    
 }
private static void inorder(Node root) {
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);

}
private static Node populate(int[] nums) {
    return populate(nums,0,nums.length-1);
  
}
private static Node populate(int[] nums, int start, int end) {
    if(start>end){
        return null;
    }
    int mid=start+(end-start)/2;
   Node root=new Node(nums[mid]);
   root.left= populate(nums, start, mid-1);
   root.right= populate(nums, mid+1, end);
   return root;
}   
}
