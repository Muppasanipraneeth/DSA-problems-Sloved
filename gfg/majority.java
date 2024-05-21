import java.util.HashMap;
import java.util.Scanner;

public class majority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]={1,2,3};
        System.out.println("enter the n value");
        int n=sc.nextInt();
        int ans=majorityelement(array,n);
        System.out.println(ans);
    }

    private static int majorityelement(int[] array,int n) {
      HashMap<Integer,Integer>map=new HashMap<>();
      int ans=0;
      for (int i = 0; i < array.length; i++) {
        map.put(array[i],map.getOrDefault(array[i], 0)+1);
        
      }
      for (int i = 0; i < array.length; i++) {
        if(map.get(array[i])>n/2){
            return ans=array[i];
        }
        
      }
      return -1;
    }
}
