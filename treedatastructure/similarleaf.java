package treedatastructure;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class similarleaf {
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();

            // Array representation of the tree
            Integer[] arr = {1,2,3};
            Integer[] arr1 = {1,3,2};

            TreeNode root = tree.buildTree(arr);
            TreeNode root1=tree.buildTree(arr1);

            System.out.println(leafSimilar(root,root1));

        }
    public static boolean   leafSimilar(TreeNode root1, TreeNode root2) {
        int[]array1=leafs(root1);
        int []array2=leafs(root2);
        if(array1.length!=array2.length){
            return false;
        }
        for( int i=0; i<array1.length;i++){
            if(array1[i]!=array2[i]){
                return false;
            }
        }
        return true;

    }
        public  static int[] leafs(TreeNode root){


            ArrayList<Integer>ans=new ArrayList<>();
            leafs(ans,root);
            System.out.println(ans);

            return ans.stream().mapToInt(i->i).toArray();
        }
        public  static void  leafs(ArrayList<Integer>ans,TreeNode root){
            if(root==null){
                return;
            }
            leafs(ans,root.left);
            leafs(ans,root.right);
            if(root.left==null && root.right==null){
                ans.add(root.data);
            }

        }


}

// Node class for the binary tree
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// BinaryTree class for tree operations
class BinaryTree {
    TreeNode root;

    // Method to build a tree from level-order representation
    public TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();

            // Add the left child
            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            // Add the right child
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    // In-order traversal (Left, Root, Right)
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    // Pre-order traversal (Root, Left, Right)
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // Post-order traversal (Left, Right, Root)
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}

// Main class


