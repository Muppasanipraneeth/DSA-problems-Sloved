import java.util.*;

public class Uinqueoccureance{
    public static void main (String args[]){
        int []array={1,2,2,1,1,3};
        boolean ans=uinque(array);


    }
    public static boolean uinque(int []array){
        HashMap<Integer,Integer>map=new HashMap<>();
        for( int i=0; i<array.length;i++){
    
            map.put(array[i], map.getOrDefault(array[i], 0)+1);
            
        }
      System.out.println(map.containsKey(map.get(array[0])));

        return true;
    }
}