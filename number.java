import java.util.Arrays;
import java.util.HashMap;

public class number {
    public static void main(String[] args) {
        int array[]={0,-10,1,3,-20};
        int ans=find(array,5);
        System.out.println(ans);
    }

    private static int find(int[] array, int i) {
       Arrays.sort(array);
       
      HashMap<Integer,Integer>p=new HashMap<>();
      for (int j = 0; j < array.length; j++) {
        if(array[j]>0){
            p.put(array[j], j);
        }
        
      }
      for (int j = 1; j <=i; j++) {
        if(!p.containsKey(j)){
            return j;

        }
        
      }
      return i+1;
    }
}
