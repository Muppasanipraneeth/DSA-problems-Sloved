import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    // 15. 3Sum
    public static void main(String[] args) {
        int array[] = { -1,0,1,2,-1,-4};
        Arrays.sort(array);
        List<List<Integer>>l=new ArrayList<>();
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                List<Integer>k=new ArrayList<>();


                for (int j2 = j+1; j2 < array.length; j2++) {
                    if (array[i] + array[j] + array[j2] == 0) {
                        System.out.println(array[i] + " " + array[j] + " " + array[j2]);
                        k.add(array[i]);
                        k.add(array[j]);
                        k.add(array[j2]);

                    }
                    if(!l.contains(k) && !k.isEmpty()){
                        l.add(k);
                    }
                }
            }
            
        }
        // l.remove(0);
        System.out.println(l);
    }
}
