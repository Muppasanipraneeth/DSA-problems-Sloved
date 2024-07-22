import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int array[] = {5, 4, 2, 1, 0};
        sorts(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void sorts(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = array[m];

        while (s <= e) {
            while (array[s] < pivot) {
                s++;
            }
            while (array[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = array[e];
                array[e] = array[s];
                array[s] = temp;
                s++;
                e--;
            }
        }
        sorts(array, low, e);
        sorts(array, s, high);
    }
}
