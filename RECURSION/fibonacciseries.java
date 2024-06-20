
import java.lang.reflect.Array;
import java.util.Arrays;

class fibonacciseries{
    public static void main(String[] args) {
        int n=336;
      
        int array[]=new int[n+1];
      
        Arrays.fill(array, -1);
        array[0]=0;
        array[1]=1;
        int ans=fibonacci(n,array);
      
        System.out.println(Arrays.toString(array));
       
        // System.out.println(Arrays.toString(result));
    }
    public static int fibonacci(int n,int []array){
        if(n==0 || n==1){
            return n;
        }
        if(n<0){
            return 0;
        }
        if(array[n]!=-1){
            return array[n];
        }
        return array[n]=fibonacci(n-1,array)+fibonacci(n-2,array);
    }
}