import java.util.Arrays;

public class Reverse {
    // this is used to revsere the array elements

 public static void main(String args[]){
    int array[]={1,2,3,4,5,6};
    revsering(array);
    System.out.println(Arrays.toString(array));
 }public static void revsering(int array[]){

    for (int i = 0, j = array.length - 1; i < array.length - 1 && j > array.length / 2; i++, j--) {
        int first = array[i];
        int last = array[j];
        array[i] = last;
        array[j] = first;
    }
    

 }  

}
