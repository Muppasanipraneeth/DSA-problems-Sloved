import java.util.ArrayList;
import java.util.List;

public class countsmaller {
    // 315. Count of Smaller Numbers After Self
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();// 5,2,6,1
        // l.add(5);
        // l.add(2);
        // l.add(6);
        l.add(-1);
        l.add(-1);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            ans.add(lessthan(l.get(i), l, i));
        }
        System.out.println(ans);
    }

    private static Integer lessthan(Integer integer, List<Integer> l, int index) {
        if (index == l.size()) {
            return 0;
        }
        int count = 0;
        for (int i = index + 1; i < l.size(); i++) {
            if (l.get(i) < integer) {
                count++;
            }
        }
        System.out.println(count);
        return count;

    }
}
