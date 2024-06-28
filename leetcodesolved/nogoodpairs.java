import java.util.*;

public class nogoodpairs {
    // 1512. Number of Good Pairs
    public static void main(String[] args) {
        int array[] = { 1, 1, 1, 1 };// 0,3), (0,4), (3,4), (2,5)
        int ans = goodpairs(array);
        System.out.println(ans);
    }

    private static int goodpairs(int[] array) {
        Hashtable<Integer, Integer> p = new Hashtable<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] == array[j] && i < j) {
                    System.out.println(array[i] + " " + array[j]);
                }

            }

        }
        System.out.println(p);
        return p.size();
    }

}
