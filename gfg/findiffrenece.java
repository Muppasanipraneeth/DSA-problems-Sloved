import java.util.*;

public class findiffrenece{
    public static void main(String[] args) {
        int array[]={5, 20, 3, 2, 5, 80};
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter the value of x");
        int x=sc.nextInt();
        int ans=finding(array,x);
        System.out.println(ans);
        int ans2=finding2(array,x);
        System.out.println(ans2);
        
        
        
    }

    private static int finding2(int[] array, int x) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int target=x+array[i];
        
            int start=i+1;
            int end=array.length-1;
            while (start<=end) {
             int mid=start+(end-start)/2;
             if(array[mid]==target){
                 return 1;
             }else if(array[mid]>target){
                end=mid-1;
             }else{
                start=mid+1;
             }
             
            }
        }
        return -1;
    }

    private static void binarysearch(int[] array, int i, int length,int target) {
      
    }

    private static int finding(int[] array, int x) {
    HashSet<Integer>s=new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
            
             s.add(Math.abs(array[i]-array[j]));
            }
        }
        if(s.contains(x)){
            return 1;
        }else{
            return -1;
        }
    }
}