import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        int dup[]=new int[array.length];
        int count=0;
        int k=3;
    // while(k<3){
    //     for (int i : array) {
    //         dup[count]=i;
    //         count++;
    //     }
    //     array[0]=dup[array.length-1];
    //     for (int i = 1; i < dup.length; i++) {
    //         array[i]=dup[i-1];
            
    //     }
    //     k++;

    //     count=0;
    
        
    rotate(array,k);
      
        System.out.println(Arrays.toString(array));
        System.out.println(3%7);
    }
    public static void rotate(int[] array, int k) {
        int n = array.length;
        k %= n; // to handle cases where k is greater than array length

        reverse(array, 0, n - 1);
        reverse(array, 0, k - 1);
        // reverse(array, k, n - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
