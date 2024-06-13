
import java.util.ArrayList;
import java.util.HashSet;

public class disappered {
    //448. Find All Numbers Disappeared in an Array
    public static void main(String[] args) {
        int array[]={1,1};
        ArrayList<Integer>list=finding(array);
        System.out.println(list);
    }

    private static ArrayList<Integer> finding(int[] array) {
        HashSet<Integer>s=new HashSet<>();
        for (int j = 0; j < array.length; j++) {
            s.add(array[j]);
        }
        System.out.println(array.length);
        ArrayList<Integer>l=new ArrayList<>();
        for (int i = 1; i <=array.length; i++) {
         if(!s.contains(i)){
            l.add(i);
         }   
        }
        return l;
    }
}
