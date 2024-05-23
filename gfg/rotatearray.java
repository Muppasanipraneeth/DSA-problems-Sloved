import java.util.Arrays;
import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of point to change");
        int n=sc.nextInt();
        System.out.println(Arrays.toString(array));
    
        reversing(array,n);


    }

    private static void reversing(int[] array, int n) {
      int N=array.length-1;
      while(n>N){
        n=n-N;
    }
   
    
        change(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

        change(array,0,N-n);
        System.out.println(Arrays.toString(array));

        change(array,N-n+1,array.length-1);
        System.out.println(Arrays.toString(array));
       
    }

    private static void change(int[] array, int i, int length) {
      int size=length;
      for (int j = i; j <=size; j++) {
        int temp=array[j];
        array[j]=array[size];
        array[size]=temp;
        size--;
      }
    }
}
