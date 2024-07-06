import java.util.Arrays;

public class mergeSortin {
    public static void main(String[] args) {
        int array[] = {1, 3, 9, 2, 0, 1, 23, 428};
        int ans[] = mergeSorting(array);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergeSorting(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int mid = array.length / 2;
        int arrayL[] = mergeSorting(Arrays.copyOfRange(array, 0, mid));
        int arrayR[] = mergeSorting(Arrays.copyOfRange(array, mid, array.length));
        return merge(arrayL, arrayR);
    }

    public static int[] merge(int[] array1, int[] array2) {
        int ans[] = new int[array1.length + array2.length];
        int ls = 0, rs = 0, i = 0;
        while (ls < array1.length && rs < array2.length) {
            if (array1[ls] < array2[rs]) {
                ans[i++] = array1[ls++];
            } else {
                ans[i++] = array2[rs++];
            }
        }
        while (ls < array1.length) {
            ans[i++] = array1[ls++];
        }
        while (rs < array2.length) {
            ans[i++] = array2[rs++];
        }
        return ans;
    }
}
