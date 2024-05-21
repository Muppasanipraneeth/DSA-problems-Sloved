import java.util.Stack;
//Reverse each word in a given string

public class reversString {
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        // int ans=(int)('.');
        // System.out.println(ans);
        String ans1 = reversing(S);
        System.out.println(ans1);

    }

    private static String reversing(String S) {
        Stack<Character> s = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                reverse(ans, s);
                ans.append('.');

                ;
            } else {
                s.add(S.charAt(i));
            }

        }
        reverse(ans, s);
        return ans.toString();

    }

    private static String reverse(StringBuilder ans, Stack<Character> s) {
        while (!s.empty()) {
            ans.append(s.pop());

        }
        // System.out.println(ans);
        return ans.toString();
    }
}
