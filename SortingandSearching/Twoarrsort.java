import java.util.Arrays;
import java.util.Collections;

public class Twoarrsort {
    //Permute two arrays such that sum of every pair is greater or equal to K
    public static void main(String[] args) {
        Integer array[]={2,1,3};
        int array2[]={7,8,9};
        int k=10;
        Arrays.sort(array2);
        Arrays.sort(array,Collections.reverseOrder());
        for( int i=0; i<array.length;i++){
            if(array[i]+array2[i]!=k){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
    
}
