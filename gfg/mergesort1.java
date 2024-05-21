import java.util.Arrays;

public class mergesort1 {
    public static void main(String[] args) {
        int array[] = { 10,12 };
        int array1[] = { 5,18,20 };
        // merging(array, array1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        merging1(array, array1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
    }

    private static void merging1(int[] array, int[] array1) {
        int ls = 0;
        int rs = 0;
        int le = array.length;
        int re = array1.length;
        int result[] = new int[le + re + 1];
        int count = 0;
        while (ls < le && rs < re) {
            if (array[ls] > array1[rs]) {
                int temp = array[ls];
                array[ls] = array1[rs];
                array1[rs] = temp;
                ls++;

            }
            Arrays.sort(array1);

        }

    }

    private static void merging(int[] array, int[] array1) {
        int ls = 0;
        int rs = 0;
        int le = array.length;
        int re = array1.length;
        int result[] = new int[le + re + 1];
        int count = 0;
        while (ls < le && rs < re) {
            if (array[ls] < array1[rs]) {
                result[count] = array[ls];

                ls++;
            } else {
                result[count] = array1[rs];
                rs++;
            }
            count++;

        }
        while (ls < le) {
            result[count++] = array[ls++];

        }
        while (rs < re) {
            result[count++] = array1[rs++];
        }
        count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = result[count++];

        }
        for (int i = 0; i < array1.length; i++) {
            array1[i] = result[count++];
        }

    }

}
// while (ls<le && rs<re) {
// if(array[ls]<array1[rs]){
// ls++;
// }else{
// array[ls]=array[rs];
// int temp=array[ls];
// array[ls]=array1[rs];
// array[rs]=temp;
// ls++;

// }
// if(array[ls]>array1[rs]){
// int temp=array1[rs];
// array1[rs]=array[ls];
// array[ls]=temp;
// rs++;
// }else{

// }

// }