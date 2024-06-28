import java.util.ArrayList;
import java.util.HashSet;

public class unionarray {
    public static void main(String[] args) {
        int array[]={1 ,2 ,3 ,4 ,5};
        int array2[]={1,2,3,6,7};
        HashSet<Integer>h=new HashSet();
        for (int i : array2) {
            h.add(i);
        }
        for (int i : array) {
            h.add(i);

        }
        ArrayList<Integer>l=new ArrayList<>();
        for (int i : h) {
            l.add(i);
        }
        System.out.println(l);
        // System.out.println(h.size());
    }
}
