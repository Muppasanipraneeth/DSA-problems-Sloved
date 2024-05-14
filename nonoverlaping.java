import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class nonoverlaping {
    // 435. Non-overlapping Intervals
    public static void main(String args[]) {
        int Intervals[][] = { { 1, 100 }, { 11, 22 }, { 1, 11 }, { 2, 12 } };
        Arrays.sort(Intervals, Comparator.comparingInt(arr -> arr[1]));
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < Intervals.length; i++) {
            map.put(i, Intervals[i][1]);

        }
        System.out.println(map);
        for (int i = 1; i < Intervals.length; i++) {
            if (!(Intervals[i][0] >= map.get(i - 1))) {

                count++;
            }

        }
        System.out.println(count);

    }
}