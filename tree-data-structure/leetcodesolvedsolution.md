# Binary Tree Balance Checker
Question number 110. Balanced Binary Tree
This solution checks if a binary tree is balanced. A binary tree is considered balanced if the height difference between the left and right subtrees of any node is no more than 1.

## Code

```java
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        return Math.max(lh, rh) + 1;
    }
}

#   109. Convert Sorted List to Binary Search Tree
## code
```java
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        int size = 0;
        
        // Calculate the size of the linked list
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        
        temp = head;
        int[] nums = new int[size];
        int i = 0;
        
        // Convert the linked list to an array
        while (temp != null) {
            nums[i] = temp.val;
            i++;
            temp = temp.next;
        }
        
        // Construct the BST from the sorted array
        return populate(nums, 0, nums.length - 1);
    }
    
    // Recursively populate the BST
    public TreeNode populate(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = populate(nums, start, mid - 1);
        root.right = populate(nums, mid + 1, end);
        
        return root;
    }
}

## Java Method: levelOrderBottom
107. Binary Tree Level Order Traversal II
```java
public static List<List<Integer>> levelOrderBottom(Node root) {
    List<List<Integer>> li = new ArrayList<>();
    if (root == null) {
        return li;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    ArrayList<Integer> l = new ArrayList<>();
    while (!q.isEmpty()) {
        Node current = q.remove();
        if (current == null) {
            System.out.println();
            li.add(l);
            l = new ArrayList<>();
            if (q.isEmpty()) {
                break;
            } else {
                q.add(null);
            }
        } else {
            System.out.print(current.data + " ");
            l.add(current.data);
            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }
        }
    }
    Collections.reverse(li);
    System.out.println(li);
    return li;
}


### Rotate array
- 189. Rotate Array


import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        int dup[]=new int[array.length];
        int count=0;
        int k=3;
    // while(k<3){
    //     for (int i : array) {
    //         dup[count]=i;
    //         count++;
    //     }
    //     array[0]=dup[array.length-1];
    //     for (int i = 1; i < dup.length; i++) {
    //         array[i]=dup[i-1];
            
    //     }
    //     k++;

    //     count=0;
    
        
    rotate(array,k);
      
        System.out.println(Arrays.toString(array));
        System.out.println(3%7);
    }
    public static void rotate(int[] array, int k) {
        int n = array.length;
        k %= n; // to handle cases where k is greater than array length

        reverse(array, 0, n - 1);
        reverse(array, 0, k - 1);
        // reverse(array, k, n - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
### right side view tree

    private static List<Integer> rightview(BinarySearchTree.Node root2) {
        List<Integer>rightside=new ArrayList<>();
        if(root==null){
            return rightside;
        }
        Queue<Node>q=new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            int size=q.size();
            List<Integer>list=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node current=q.poll();
                list.add(current.data);
                if(current.left!=null){
                    q.add(current.left);

                }
                if(current.right!=null){
                    q.add(current.right);
                }
                
            }
            rightside.add(list.get(size-1));
            // Node current=q.poll();
            // rightside.add(current.data);
            // if(current.right!=null){
            //     q.add(current.right);
            // }
            
        }
        return rightside;
    }