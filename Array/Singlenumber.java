package Array;

import java.util.HashMap;

public class Singlenumber {
    public static void main(String[] args) {
        int array[]={4,1,2,1,2};
        int ans =singlenum(array);
        System.out.println( ans);
    }
    public  static  int singlenum(int [] array){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);

        }
        for(int i=0;i<array.length;i++){
            if(map.get(array[i])==1){
                return array[i];
            }
        }
        return -1;
    }
}
