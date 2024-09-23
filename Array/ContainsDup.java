
import java.util.HashSet;
// this question is about the if the array contains the duplicates or not

public class ContainsDup {
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        boolean ans=dupcon(array);
        System.out.println(ans);

    }
    public static boolean dupcon(int []array){
        HashSet<Integer>map=new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if(map.contains(array[i])){
                return true;
            }else{
                map.add(array[i]);

            }
            
        }
        return false;
    }
}
