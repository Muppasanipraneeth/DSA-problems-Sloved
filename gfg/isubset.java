import java.util.Arrays;
import java.util.HashMap;

public class isubset {
    public static void main(String[] args) {
        long array1[]={1,2,3,4,5,6,7,8};
        long array2[]={1,2,1};
       
        String ans=checking(array1,array2);
        System.out.println(ans);

    }

    private static String checking(long[] array1, long[] array2) {
        HashMap<Long,Long>map=new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            map.put(array1[i], map.getOrDefault(array1[i], (long) 0)+1);
            
        }
        System.out.println(map);
      String ans="yes";
      for (int i = 0; i < array2.length; i++) {
        if(map.containsKey(array2[i]) && map.get(array2[i])>0){
            long value= (map.get(array2[i])-1);
            if(value==0){
                map.remove(array2[i]);
            }
            map.put(array2[i], value);
        }else{
            return "No";
        }
        
        
      }
      System.out.println(map);
      return ans;

    }

    private static boolean binarysearch(int target, int[] array1) {
        // TODO Auto-generated method stub
     
     int start=0;
     int end=array1.length-1;
     while (start<=end) {
        int mid=start+(end-start)/2;
        if(array1[mid]==target){
            return true;
        }else if(array1[mid]>target){
            end=mid-1;
        }else{
            start=mid+1;
        }
        
     }
     return false;
    }
}
