import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class uniquestr {
    // 387. First Unique Character in a String
    public static void main(String[] args) {
        String k = "aabb";
        Hashtable<Character, Integer> p = new Hashtable<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < k.length(); i++) {
            p.put(k.charAt(i), p.getOrDefault(k.charAt(i), 0) + 1);

        }
        for (int i = 0; i < k.length(); i++) {
            if (p.get(k.charAt(i)) == 1) {
                q.add(i);

            }
        }
        if (q.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(q.peek());
        }
    }
}
