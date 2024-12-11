package Array;

import java.util.HashMap;
import java.util.HashSet;

public class Uniquenumeberofoccurance {
    public static void main(String[] args) {
        int array[]={1,2,2,1,3};
        boolean ans=isUnique(array);
        System.out.println(ans);
    }
    public static boolean isUnique(int[] array){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i:map.values()){
            if(!set.contains(i)){
                set.add(i);
            }else{
                return false;
            }
        }


        return  true;
    }
}
