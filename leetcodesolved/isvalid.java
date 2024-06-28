import java.util.Stack;

public class isvalid {
    // 20. Valid Parentheses
    public static void main(String[] args) {
        String s = "(]";
        boolean ans = Isvalidor(s);
        System.out.println(ans);
    }

    private static boolean Isvalidor(String s) {
        Stack<Character> sta = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')' || ch == ']' || ch == '}') {
                char p = sta.pop();
                if (ch == ')' && p == '(') {

                } else {
                    return false;
                }
                if (ch == ']' && p == '[') {

                } else {
                    return false;
                }
                if (ch == '}' && p == '{') {

                } else {
                    return false;
                }

            } else {
                sta.add(ch);
            }

        }
        return sta.isEmpty();
    }
}
