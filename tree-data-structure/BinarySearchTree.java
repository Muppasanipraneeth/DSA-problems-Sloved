import java.util.*;

// import javax.swing.tree.TreeNode;

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
        Scanner sc= new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        int nums[] = { 1,2,5,3,4,6};
        Arrays.sort(nums);

        populate(nums);
        System.out.println("inorder traversal");
        inorder(root);
        System.out.println("preorder traversal");
        preorder(root);
        System.out.println("postorder  traversal");
        postorder(root);
        System.out.println();
        // System.out.println("Tree is balanced: " + tree.balanced());
        // int ans = heightoftree(root);
        // System.out.println(ans);
        // int no = countingnodes(root);
        // System.out.println(" the number of nodes are " + no);
        // int sum = rangeSumBST(root, 6, 10, 0);
        // System.out.println(sum);
        // levelOrderBottom(root);
        // List<Double>avg= averageOfLevels(root);
        // System.out.println(avg);
        // List<List<Integer>>zigzag1=zigzagtraversal(root);
        // System.out.println(" enter the key value ");
        // int key=sc.nextInt();
        // int ans2=inordersucessor(root, key);
        // System.out.println(ans2);
        // List<Integer>r=rightview(root);
        // System.out.println(" the right side view is"+r);
        // int ans=sumofleaf(root);
        // System.out.println((float)17/2);
        // boolean ans=isVaild(root);
        // System.out.println(ans);
        // Scanner in=new Scanner(System.in);
        // System.out.println("enter the target value");
        // int target=in.nextInt();
        // boolean ans1=pathsum(root,target);
        // System.out.println(ans1);
        
        Node linkedlist=flattentree(root);

    }

   

    private static Node flattentree(BinarySearchTree.Node root) {
        if(root==null){
            return null;
        }
        Queue<Integer>q=new LinkedList<>();
        addingelemts(root,q);
        while (!q.isEmpty()) {
            int value=q.remove();
            r
        }
        
       
    }

    private static void addingelemts(BinarySearchTree.Node root, Queue<Integer> q) {
      if(root==null){
        return ;
      }
      q.add(root.data);
      addingelemts(root.left,q);
      addingelemts(root.right,q);

    }

    private static boolean pathsum(Node root2, int target) {
        return pathsum(root2, target,0);
      
    }

   private static boolean pathsum(BinarySearchTree.Node root, int target, int sum) {
       if (root==null) {
        return target==sum;
        
       }
       sum+=root.data;
       boolean l=pathsum(root.left, target,sum);
       boolean r=pathsum(root.right, target,sum);
       return l||r;
    }

 private static boolean isVaild(Node root) {
        return isVaild(root,Long.MIN_VALUE,Long.MAX_VALUE);
      
    }

    private static boolean isVaild(Node root, long minValue, long maxValue) {
      if(root==null)return true;
      if(root.data>maxValue || root.data<minValue)return false;
      return isVaild(root.left, minValue, root.data)&&isVaild(root.right, root.data, maxValue);
    }

    private static int sumofleaf(BinarySearchTree.Node root2) {
     if(root==null){
        return 0;
     }
     int sum=0;
     Queue<Node>q=new LinkedList();
q.add(root);
while(!q.isEmpty()){
    Node current=q.poll();
    if(current.left!=null){
        q.add(current.left);
    }
    if(current.right!=null){
        q.add(current.right);
    }
    if(current.left==null && current.right==null){
        sum+=current.data;
    }
}
return sum;



    }
    

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

    private static int inordersucessor(Node root, int key) {
        if(root==null){
            return -1;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node current=q.poll();
            if(current.data==key){
                q.poll();
                break;
            }
            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);
            }
            
        }
        return q.poll().data;

    }

    private static List<List<Integer>> zigzagtraversal(Node root) {
        List<List<Integer>>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<Node>q=new LinkedList<>();
        q.add(root);
        boolean left2right=false;
        while (!q.isEmpty()) {
            int size=q.size();
            List<Integer>l=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if(left2right){
                    Node current =q.pollLast();
                    l.add(current.data);
                    if(current.right!=null){
                        q.addFirst(current.right);
                    }
                    if(current.left!=null){
                        q.addFirst(current.left);
                    }
                   
                    

                }else{
                    Node current =q.pollFirst();
                    l.add(current.data);
                    if(current.left!=null){
                        q.addLast(current.left);
                    }
                    if(current.right!=null){
                        q.addLast(current.right);
                    }

                }
                
            }
            result.add(l);
            left2right=!left2right;
            

            
        }
        // System.out.println(result);
        return result;
    }

    private static List<Double> averageOfLevels(BinarySearchTree.Node root2) {
       List<Double>avg=new ArrayList<>();
       if(root==null){
        return avg;
       }
       Queue<Node>q=new LinkedList<>();
       q.add(root);
       while (!q.isEmpty()) {
        int size=q.size();
        float average=0;
        int sum=0;
        for (int i = 0; i < size; i++) {
            Node current=q.poll();
            sum+=current.data;

            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);

            }
        }
        // System.out.println("sum is"+sum);
        average=(float)sum/size;
        // System.out.println("average is "+average);
        avg.add((double)average);
        
       }


       return avg;

    }

    public  static List<List<Integer>> levelOrderBottom(Node root) {
        List<List<Integer>> li = new ArrayList<>();
        if (root == null) {
            return li;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer>l=new ArrayList<>();
        int sum=0;
        int count=1;
        while (!q.isEmpty()) {
        
            Node current = q.remove();
            if(current==null){
                System.out.println();
                            li.add(l);
                System.out.println("level"+count+" is "+sum);
                count++;
                l=new ArrayList<>();
                sum=0;

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }

            }else{
                System.out.print(current.data + " ");
                sum+=current.data;
                l.add(current.data);
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
        

        }
        // Collections.reverse(li);
        System.out.println(li);
        return li;

    }

    private static int rangeSumBST(Node root, int low, int high, int sum) {
        if (root == null) {
            return sum;
        }

        // rangeSumBST(root.left, low, high,sum);
        // rangeSumBST(root.right, low, high,sum);
        // if(root.data>=low || root.data<=high){
        // return sum+=root.data;
        // }

        // return sum;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode.data >= low && currNode.data <= high) {
                sum += currNode.data;

            }

            if (currNode.left != null) {
                q.add(currNode.left);
            }
            if (currNode.right != null) {
                q.add(currNode.right);
            }
        }
        return sum;
    }

    private static int countingnodes(Node root2) {
        if (root2 == null) {
            return 0;
        }
        int lh = countingnodes(root2.left);
        int rh = countingnodes(root2.right);
        return lh + rh + 1;
    }

    private static int heightoftree(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = heightoftree(root.left);
        int rh = heightoftree(root.right);
        return Math.max(lh, rh) + 1;
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
