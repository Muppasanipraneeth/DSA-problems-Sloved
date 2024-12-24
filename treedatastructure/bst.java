
// this program is about create the bst from the sorted array and done by using recursion
public class bst {
    public static class Node {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        int array[] = { -10, -3, 0, 5, 9 };
        Node tree = build(array, 0, array.length - 1);
        inorder(tree);
    }

    private static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private static bst.Node build(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Node root = new Node(array[mid]);
        root.left = build(array, start, mid - 1);
        root.right = build(array, mid + 1, end);
        return root;
    }

}
