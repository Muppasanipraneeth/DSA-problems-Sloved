import  java.util.*;
public class twoequallarray {
 // checking if two array are equall or not
 public static void main(String[] args) {
     long array1[]={2,4,4,1,5,6};
     long array2[]={1,4,4,4,6,5};
     boolean ans=checkequall(array1,array2);
     System.out.println(ans);
     
 }   

    private static boolean checkequall(long[] array1, long[] array2) {
   HashMap<Long,Long>map=new HashMap<>();
   for (int i = 0; i < array1.length; i++) {
    map.put(array1[i], map.getOrDefault(array1[i], (long)0)+1);

    
}
for (int i = 0; i < array2.length; i++) {
    if(map.containsKey(array2[i])){
        Long value=map.get(array2[i]);
        if(value==0){
            return false;
        }
        map.put(array2[i], value-1);
    }else{
        return false;
    }
}
   
   return true;
}

    private static boolean checkequall(int[] array1, int[] array2) {
       HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            map.put(array1[i], map.getOrDefault(array1[i], 0)+1);

            
        }
        for (int i = 0; i < array2.length; i++) {
            if(map.containsKey(array2[i])){
                Integer value=map.get(array2[i]);
                if(value==0){
                    return false;
                }
                map.put(array2[i], value-1);
            }else{
                return false;
            }
        }


       return true;

    }
}
