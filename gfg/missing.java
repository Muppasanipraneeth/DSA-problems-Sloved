import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class missing {
    public static void main(String[] args) {
        // find twomissing elements inthe array
        int array[]={1,2,3};
        int ans[]=findmissing(array);
        System.out.println(Arrays.toString(ans));
        
    }


    private static int[] findmissing(int[] array) {
        int result[]=new int[2];
        int missing=1;
        int mis=Integer.MAX_VALUE;
      
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0)+1);
            
        }
        for (int i = 1; i < array.length; i++) {
            if(!map.containsKey(i)){
                mis=i;
            }
            
        }
        int maxvalue=0;
        int mode=0;
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        int key=entry.getKey();
        int value=entry.getValue();
            if(value>maxvalue){
                maxvalue=value;
                mode=key;
            }
        }
        result[1]=mis;
        result[0]=mode;
        System.out.println(missing);
        return result;
    }
}
