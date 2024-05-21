import java.util.Arrays;
import java.util.Scanner;

public class kthlargest {
    public static void main(String[] args) {
       int Arr[] = {1, 23, 12, 9, 30, 2, 50};
       Scanner sc=new  Scanner(System.in);
       int k=sc.nextInt();
       int[]ans=kth(Arr,k);
       System.out.println(Arrays.toString(ans));
        
    }

    private static int[] kth(int[] arr, int k) {
       int s=arr.length-1;
       Arrays.sort(arr);
       for (int i = 0; i < s; i++) {
        int temp=arr[i];
        arr[i]=arr[s];
        arr[s]=temp;
        s--;
        
       }
       int ans[]=new int[k];
       for (int i = 0; i < k; i++) {
        ans[i]=arr[i];
       }
       return ans;


    }
}
