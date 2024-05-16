 public  static List<List<Integer>> levelOrderBottom(Node root) {
        List<List<Integer>> li = new ArrayList<>();
        if (root == null) {
            return li;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer>l=new ArrayList<>();
        while (!q.isEmpty()) {

            Node current = q.remove();
            if(current==null){
                System.out.println();
                            li.add(l);

                l=new ArrayList<>();

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }

            }else{
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