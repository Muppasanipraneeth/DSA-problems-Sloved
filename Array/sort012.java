
import java.lang.reflect.Array;
import java.util.Arrays;



public class sort012 {
    public static void main(String args[]){
        int array[]={0,2,1,1,0};
      int ans[]=sorting(array);
      System.out.println(Arrays.toString(ans));
    //   System.out.println(Arrays.toString(ans))
    }public static int[] sorting( int []array){
        int max=array[0];
        for( int m :array){
            if(m>max){
                max=m;
            }
        }
        int freq[]=new int[max+1];
        for( int i=0; i<array.length; i++){
            freq[array[i]]++;
        }
        System.out.println(Arrays.toString(freq));
        int ind=0;
        for( int i=0; i<=max; i++){
            while(freq[i]>0){
                array[ind]=i;
                ind++;
                freq[i]--;
            }
        }
        return array;
    }
    
}
