import java.util.HashMap;

public class countoccarence {
    public static void main(String[] args) {
        int array[]={2,3,3,2};
        int k=3;
        int ans=countoccurance(array,k,array.length);
        System.out.println(ans);
    }

    private static int countoccurance(int[] array, int k, int n) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for (int i = 0; i < array.length; i++) {
        map.put(array[i],map.getOrDefault(array[i],0)+1);
         
       }
       int count=0;
       for (int i : map.values()) {
        if(i>n/k){
            count++;
        }
       }
       return count;
    }
}
