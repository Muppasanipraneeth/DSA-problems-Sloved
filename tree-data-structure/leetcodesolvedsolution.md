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
