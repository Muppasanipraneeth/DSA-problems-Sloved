import java.util.HashSet;

public class findtriplesum {
    public static void main(String[] args) {
        int array[]={1, 2, 3};
        boolean ans=finding(array);
        System.out.println(ans);
    }

    private static boolean finding(int[] array) {
        
       HashSet<Integer>s=new HashSet<>();
       for (int i = 0; i < array.length; i++) {
        s.add(array[i]);
       }
       for (int i = 0; i < array.length; i++) {
        for (int j = i+1; j < array.length; j++) {
            int value=array[i]+array[j];
            if(s.contains(value)){
                return true;
            }
        }
        
       }
       return false;
    }
}
