import java.util.ArrayList;

public class kthsmallfrac {
    /*
     * You are given a sorted integer array arr containing 1 and prime numbers,
     * where all the integers of arr are unique. You are also given an integer k.
     * 
     * For every i and j where 0 <= i < j < arr.length, we consider the fraction
     * arr[i] / arr[j].
     * 
     * Return the kth smallest fraction considered. Return your answer as an array
     * of integers of size 2, where answer[0] == arr[i] and answer[1] == arr[j].
     */
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 5 };
        ArrayList<ArrayList<Integer>> p = new ArrayList<>();
        float ans = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                ArrayList<Integer> k = new ArrayList<>();
                if (i < j && prime(array[i])) {
                    System.out.println(array[i] + " " + "/" + array[j]);
                    ans = Math.min(ans, (float) array[i] / array[j]);
                    float m = (float) array[i] / array[j];
                    System.out.println(m);

                    k.add(array[i]);
                    k.add(array[j]);

                } else {
                    break;
                }
                if (!k.isEmpty()) {
                    p.add(k);
                }

            }

        }
        System.out.println(p);
        System.out.println((float) 1 / 2);
    }

    private static boolean prime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0 && i != number) {
                return false;
            }

        }
        return true;

    }
}
