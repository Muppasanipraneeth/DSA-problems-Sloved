import java.util.ArrayList;
import java.util.Arrays;

public class nextgreater {
    public static void main(String[] args) {
        int array1[]={2,4};
        int array2[]={1,2,3,4};
        int ans[]=Findinggreater(array1,array2);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] Findinggreater(int[] array1, int[] array2) {
        // ArrayList<Integer>l=new ArrayList<>();
        int result[]=new int [array1.length];
       for (int i = 0; i < array1.length; i++) {
        result[i]=helper(array2,array1[i]);
       }
       return result;
    }

    private static int helper(int[] array2, int i) {

       for (int j = 0; j < array2.length; j++) {

        if(array2[j]==i){
            System.out.println(j+" index");
            System.out.println(array2[j]+"element");
            return greater(array2,j);
        }
        
       }
       return -1;
    }

    private static int greater(int[] array2, int j) {
        int max=array2[j];
        int ans=-1;
    for (int i = j+1; i < array2.length; i++) {
        if(array2[i]>max){
            return array2[i];
        }
    }
    return ans;
    }
}
