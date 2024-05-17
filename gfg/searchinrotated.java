import java.util.Arrays;
import java.util.Scanner;



public class searchinrotated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]={5, 6, 7, 8, 9, 10, 1, 2, 3};
        
        System.out.println(Arrays.toString(array));
       
        System.out.println("enter the key");
        int key=sc.nextInt();
        int ans=search(array,key);
        System.out.println(ans);
    }

    private static int search(int[] array,int key) {
        int pivot=findpivot(array);
        if(array[pivot]==key){
            return pivot;
        }else if(key>=array[0]){
            return binarysearch(array,key,0,pivot-1);
        }else{
            return binarysearch(array,key,pivot+1,array.length);
        }

    }

   private static int binarysearch(int[] array, int key, int start, int end) {
    while(start<=end){
        int mid=start+(end-start)/2;
        if(array[mid]==key){
            return mid;
        }else if (array[mid]<key) {
            start=mid+1;
            
        }else{
            end=mid-1;
        }
    }
    return -1;
      
    }

 private static int findpivot(int[] array) {
        int pivot=0;
      for (int i = 0; i < array.length; i++) {
        if(array[i]>array[pivot]){
            pivot=i;
        }
      }
      return pivot;
    }
}
