import java.util.Stack;

public class validstring {
    public static void main(String[] args) {
        String parenthesis = "()(())(";
        int ans = valid(parenthesis);
        System.out.println(ans);
    }

    private static int valid(String parenthesis) {
        int count = 0;
        int maxcount = 0;
        boolean change = false;
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < parenthesis.length(); i++) {
            if (parenthesis.charAt(i) == '(') {
                s.add(parenthesis.charAt(i));
            } else if (parenthesis.charAt(i) == ')' && s.isEmpty()) {
                if(count!=0){
                    maxcount = Math.max(count, maxcount);
                    change=true;
                }
                
                count = 0;
                
            } else {
                if (!s.isEmpty()) {
                    s.pop();
                    count = count + 2;

                }
            }

        }
        if(change){
            return maxcount;
        }else{
            maxcount=  Math.max(maxcount,count);
            return maxcount;
        }
     
    }
}
