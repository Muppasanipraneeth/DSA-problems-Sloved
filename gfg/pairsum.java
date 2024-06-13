
import java.util.HashMap;
import java.util.HashSet;

public class pairsum {
   public static void main(String args[]) {
    int array[]={1, 2,5,6,7};
    int target=4;
    boolean ans=tagestsum(array,target);
    System.out.println(ans);
}
public static boolean tagestsum(int array[], int target){
    HashMap<Integer,Integer>s=new HashMap<>();
    for (int i = 0; i < array.length; i++) {
        s.put(array[i], i);
    }
    for (int j = 0; j < array.length; j++) {
        if(s.containsKey(target-array[j]) && s.get(target-array[j])!=j){
            return true;
        }
    }
    
    
return false;
}



}


   
  
/*}*/
