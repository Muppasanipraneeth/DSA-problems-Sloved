import java.util.Arrays;

public class sumofSquare {
    public static void main(String[] args) {
        int number = 5;
        int array[] = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int sum1 = array[i] * array[i];
                int sum2 = array[j] * array[j];
                if (sum1 + sum2 == number) {
                    System.out.println(true);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
