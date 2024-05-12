import java.util.ArrayList;
import java.util.List;

public class coutnpairs {
    // 2824. Count Pairs Whose Sum is Less than Target
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(-1);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(1);
        // l.add(-1);
        // l.add(3);
        int array[] = { -1, 1, 2, 3, 1 };
        int Target = 2;
        int ans = counting(array, Target);
        int ans1 = counti(l, Target);
        System.out.println(ans1);

        System.out.println(ans);

    }

    private static int counti(List<Integer> l, int target) {
        int count = 0;
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i) + l.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int counting(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
