package Array;

import java.util.HashMap;

public class Firsttime {
    public static void main(String[] args) {
        int array[] = {4, 1, 2, 1, 2};
        int ans = singleNumber(array);
        System.out.println(ans);
    }

    public static int singleNumber(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Populate the HashMap with counts of each number
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return 0; // Default return value if no single number found
    }
}
