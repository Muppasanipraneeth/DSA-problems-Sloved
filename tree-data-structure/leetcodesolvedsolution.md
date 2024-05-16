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
