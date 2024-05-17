import java.util.HashMap;
import java.util.Scanner;

public class numberoccarence {
    
    public static void main(String[] args) {
        int array[] = { 1, 1, 2, 2, 2, 2, 3 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the k value");
        int k = sc.nextInt();
        // int ans = occarence(array, k);
        // System.out.println(ans);
        int ans2 = occarence2(array, k);
        System.out.println(ans2);
    }

    private static int occarence2(int[] array, int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                count++;
            }
        }
        return count;
    }

    private static int occarence(int[] array, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);

        }
        if (map.containsKey(k)) {
            return map.get(k);
        } else {
            return 0;
        }

    }
}
