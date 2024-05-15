import java.util.*;

public class BinarySearchTree {
    public static class Node {
        int data;
        Node right;
        Node left;
        int height;

        public Node(int data) {
            this.data = data;
            this.height = 1; // Initialize height to 1 when the node is created
        }

        public int getvalue() {
            return this.data;
        }
    }

    public static Node root;
    public static int ind = 0;

    // Helper method to get the height of a node, returning 0 if the node is null
    public static int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    // Public insert method which starts the recursive insertion
    public static Node insert(int value) {
        root = insert(root, value); // Update root to handle changes in root due to insertion
        return root;
    }

    // Recursive insert method
    public static Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value); // Create a new node if current node is null
        }
        if (value < node.data) {
            node.left = insert(node.left, value); // Insert into left subtree
        } else if (value > node.data) {
            node.right = insert(node.right, value); // Insert into right subtree
        } else {
            // Value already exists in the tree
            return node;
        }

        // Update the height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        return node; // Return the updated node
    }

    public static boolean isEmpty() {
        return root == null;
    }

    // Public balanced method
    public static boolean balanced() {
        return balanced(root);
    }

    // Private balanced method to check if a subtree is balanced
    private static boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.abs(leftHeight - rightHeight) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int nums[] = { 10,5,15,3,7,13,18,1,6};
        Arrays.sort(nums);

        populate(nums);
        System.out.println("inorder traversal");
        inorder(root);
        System.out.println("preorder traversal");
        preorder(root);
        System.out.println("postorder  traversal");
        postorder(root);
        System.out.println();
        System.out.println("Tree is balanced: " + tree.balanced());
       int ans= heightoftree(root);
       System.out.println( ans);
       int no=countingnodes(root);
       System.out.println(" the number of nodes are "+no);
       int sum=rangeSumBST(root,6,10,0);
       System.out.println(sum);
       boolean isbalence=isBalanced(root);
    }

   private static boolean isBalanced(Node root) {
       if(root==null){
        return true;
       }
       return Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right)
    }

private static int rangeSumBST(Node root, int low, int high,int sum) {
    if(root==null){
        return sum;
    }
   
    //   rangeSumBST(root.left, low, high,sum);
    //  rangeSumBST(root.right, low, high,sum);
    //  if(root.data>=low || root.data<=high){
    //     return sum+=root.data;
    // }
   
    //    return sum;
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
        Node currNode=q.remove();
        if(currNode.data>=low && currNode.data<=high){
            sum+=currNode.data;
            
        }

        if(currNode.left!=null){
            q.add(currNode.left);
        }
        if(currNode.right!=null){
            q.add(currNode.right);
        }
    }
    return sum;
    }

private static int countingnodes(Node root2) {
      if(root2==null){
        return 0;
      }
      int lh=countingnodes(root2.left);
      int rh=countingnodes(root2.right);
      return lh+rh+1;
    }

private static int  heightoftree(Node root) {
       if(root==null){
        return 0;
       }
       int lh=heightoftree(root.left);
       int rh=heightoftree(root.right);
       return Math.max(lh, rh)+1;
    }

 private static void postorder(Node root2) {
        if (root2 == null) {
            return;
        }
        System.out.print(root2.data + " ");
        preorder(root2.left);
        preorder(root2.right);
    }

    private static void preorder(Node root2) {
        if (root2 == null) {
            return;
        }
        preorder(root2.left);
        preorder(root2.right);
        System.out.print(root2.data + " ");

    }

    // Inorder traversal of the tree
    private static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Populate the tree with an array of values
    private static void populate(int[] nums) {

        populate(nums, 0, nums.length - 1);
    }

    private static void populate(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        int mid = start + (end - start) / 2;
        insert(nums[mid]);
        populate(nums, start, mid - 1);
        populate(nums, mid + 1, end);

    }
}
