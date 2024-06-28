import java.util.Hashtable;

public class containdup {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 1 };
        int k = 3;
        boolean ans = conatin(array, k);
        System.out.println(ans);
    }

    private static boolean conatins(int[] array, int k) {
        boolean ans = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i != j && Math.abs((i - j)) <= k && array[i] == array[j]) {
                    return ans = true;

                }

            }
        }
        return ans;
    }

    private static boolean conatin(int[] array, int k) {
        boolean ans = false;
        Hashtable<Integer, Integer> t = new Hashtable<>();
        for (int i = 0; i < array.length; i++) {
            if (t.containsKey(array[i])) {

                int j = t.get(array[i]);
                // System.out.println(j + " j");
                // System.out.println(j + " j");
                if (i != j && Math.abs(i - j) <= k) {
                    return ans = true;
                }
            }
            t.put(array[i], i);

        }
        // for (int i = 0; i < array.length; i++) {
        // if (t.containsKey(array[i])) {
        // int p = t.get(array[i]);
        // // System.out.println(p);
        // if (Math.abs(p - i) <= k && p != i) {
        // return ans = true;
        // }
        // }

        // }
        return ans;
    }
}
