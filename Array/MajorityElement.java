package Array;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int array[]={3,2,3};
        int maj=Majority(array);
        System.out.println(maj);
    }
    public static int Majority(int[] array) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
            if(map.get(array[i])>array.length/2){
                return array[i];
            }
        }


    return -1;

    }
}

