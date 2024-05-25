import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class commonelement {
    public static void main(String args[]){
        int array1[]={1, 5, 10, 20, 40, 80};
        int array2[]={6, 7, 20, 80, 100};
        int array3[]={3, 4, 15, 20, 30, 70, 80, 120};
        ArrayList<Integer>ans=common(array1,array2,array3);
        System.out.println(ans);

    }

    private static ArrayList<Integer> common(int[] array1, int[] array2, int[] array3) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        Arrays.sort(array3);

       ArrayList<Integer>p=new ArrayList<>();
       for (int i = 0; i < array1.length; i++) {
        if (i > 0 && array1[i] == array1[i - 1]) continue;
        if(find(array1[i],array2) && find(array1[i],array3)){
            p.add(array1[i]);
        }
       }
        return p;
    }

    private static boolean find(int target, int[] array) {
        int start=0;
        int end=array.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(array[mid]==target){
                return true;
            }else if(target<array[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
            

        }
        return false;
        
    }
}
