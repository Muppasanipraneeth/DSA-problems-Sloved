import java.util.Arrays;

public class rearrange{
    public static void main(String[] args) {
        int array[]={4,0,2,1,3};
        rearranging(array);
        System.out.println(Arrays.toString(array));
    }

    private static void rearranging(int[] array) {
    int result[]=new int[array.length];
    for (int i = 0; i < result.length; i++) {
        result[i]=array[array[i]];
    }
    System.out.println(Arrays.toString(result));
    int count=0;
    for (int i : result) {
        array[count]=i;
        count++;
    }
    }

}