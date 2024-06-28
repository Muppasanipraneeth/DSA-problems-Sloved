import java.util.Arrays;
import java.util.Scanner;

// import Implementing.binarytree;

public class searchsorted{
    public static void main(String[] args) {
        int array[]={1,0,1,1,1};
        System.out.println(Arrays.toString(array));
        // rotate(array,3);
        System.out.println(Arrays.toString(array));
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        boolean ans=search(array,key);
        System.out.println(ans);
    
    }
    private static boolean search(int[] array, int key) {
        int pivot=findpivot(array);
        System.out.println(pivot);
        if(array[pivot]==key){
            return true;
        }else if(key<=array[0]){
            return binarysearch(array,pivot+1,array.length-1,key);
        }else{
            return binarysearch(array,0,pivot-1,key);
        }
    }
    private static boolean binarysearch(int[] array, int i, int j,int key) {
        int start=i;
        int end=j;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==key){
                return true;
            }else if(key<array[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;

    }
    private static int findpivot(int[] array) {
     int pivot=0;
     for (int i = 0; i < array.length; i++) {
        if(array[i]>=array[pivot]){
            pivot=i;
        }
     }
     return pivot;
      
    }
    private static void rotate(int[] array, int n) {
        swap(array,0,array.length-1);

        swap(array, n, array.length-1);
        swap(array, 0, n-1);


       
    }
    private static void swap(int[] array, int start, int end) {
        int n=end;
      for (int j = start; j <=end; j++) {
        int temp=array[j];
        array[j]=array[end];
        array[end]=temp;
        end--;
      }
    }
}