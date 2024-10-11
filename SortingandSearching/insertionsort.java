import java.util.Arrays;

public class insertionsort {

     public static void main(String[] args) {
        int array[]={5,3,2,1,0};
        for (int i = 1; i < array.length; i++) {
            int current =array[i];
            int prev=i-1;
            while (prev>=0 && array[prev]>current) {
                 array[prev+1]=array[prev];
                 prev--;
                
            }
            array[prev+1]=current;


            
        }
        System.out.println(Arrays.toString(array));
     }
}