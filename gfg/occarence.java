import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class occarence{
public static void main(String[] args) {
    int array[]={18 ,24 ,24, 21 ,10, 29 ,8, 10 ,29 ,18};
    int ans[]=occurences(array);
    System.out.println(Arrays.toString(ans));
}

private static int[] occurences(int[] array) {

 HashMap<Integer,Integer>table=new HashMap<>();
 for (int i = 0; i < array.length; i++) {
    table.put(array[i],table.getOrDefault(array[i], 0)+1);

 }
 ArrayList<Integer>a=new ArrayList<>();
for (int i = 0; i < array.length; i++) {
    if(table.get(array[i])==1){
        a.add(array[i]);
    }
}
Collections.sort(a);
int ans[]=new int[a.size()];
int count=0;
for (Integer integer : a) {
    ans[count]=integer;
    count++;
}
return ans;

   
}
}