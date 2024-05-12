import java.util.Arrays;

public class threesum {
    // 15. 3Sum
    public static void main(String[] args) {
        int array[] = { -1, 0, 1, 2, -1, -4 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int j2 = 0; j2 < array.length; j2++) {
                    if (array[i] + array[j] + array[j2] == 0 && i != j && j != j2) {
                        System.out.println(array[i] + " " + array[j] + " " + array[j2]);
                    }
                }
            }
        }
    }
}
