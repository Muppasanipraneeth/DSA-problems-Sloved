import java.util.Arrays;

public class convertowave {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        convert(array);
        System.out.println(Arrays.toString(array));
    }

    private static void convert(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int temp=array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
            i++;
        }
        
    }
}
