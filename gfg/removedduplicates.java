import java.util.*;
class removedduplicates{
    public static void main(String args[]){
        int array[]={1,2,2,3};
        int ans=duplicates(array);
    System.out.println(ans);
    }
    public static int duplicates(int []array){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i <array.length; i++) {
        map.put(array[i],map.getOrDefault(array[i], 0)+1);
        }
    return map.size();
    }
}