import java.util.LinkedList;
import java.util.Queue;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "nagaram";
        String s2 = "anagram";
        boolean ans = Valid(s1, s2);
        System.out.println(ans);
    }

    private static boolean Valid(String s1, String s2) {
        boolean ans = true;
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < s2.length(); i++) {
            q.add(s2.charAt(i));
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (q.contains(ch)) {

                q.remove(ch);
            } else {
                return false;
            }

        }
        if (!q.isEmpty()) {
            return false;
        }
        return ans;
    }
}
