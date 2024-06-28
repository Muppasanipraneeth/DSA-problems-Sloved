import  java.util.*;

class learning{
    public static void main(String[] args) {
        // this program is about printing the number in increasing order
        // increasing(10);
        // decreasing(10);
        // int ans=factorial(5);
        // System.out.println(ans);
      
        // System.out.println(fibonacci(6));
        int array[]={1,2,3,4,5};
        //  sum(array);
        // boolean ans=sorted(array,0);
        // System.out.println(ans);
// minAndmax(array,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
// int ans=binarySearch(array,10);
// System.out.println("the ans was found at index "+ans);
System.out.println(binarySearch(array, 0, array.length-1, 4));

    }public static int binarySearch( int array[],int start,int end,int target){
        if(!(start<=end)){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(array[mid]==target){
            return mid;
        }else if(array[mid]<target){
            return binarySearch(array,start,mid-1,target);
        }else{
            return binarySearch(array, mid+1, end, target);
        }
    
    }

    public static int binarySearch( int array[],int target){
    int start=0;
    int end=array.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(array[mid]==target){
            return mid;
        }else if(array[mid]>target){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
    return -1;
    }
    public static void minAndmax(int array[],int i,int min,int max){
        if(array.length==i){
            System.out.println(" the min value is"+min+"Max values is "+max);
            return ;
        }
        if(array[i]>max){
            max=array[i];
        }
        if(array[i]<min){
            min=array[i];
        }
        minAndmax(array,i+1,min,max);

    }
    public static void sum( int []array){
        if(array.length==1){
            return;
        }
        int newarray[]=new int[array.length-1];
        helper(array,newarray);
        sum(newarray);
        System.out.println(Arrays.toString(newarray));

    }
    private static void helper(int[] array, int[] newarray) {
  for( int i=0; i<array.length-1; i++){
    newarray[i]=array[i]+array[i+1];
  }
    }
    public static boolean sorted( int []array,int i){
        if(i==array.length-1){
            return true;
        }
        if(array[i]>array[i+1]){
            return false;
        }
        return sorted(array, i+1);
    }
    private static int fibonacci(int n) {
       if(n==0 || n==1){
        return n;
       }
       return fibonacci(n-1)+fibonacci(n-2);
    }
    private static int factorial(int i) {
   if(i==1){
    return i;

   }
   return i*factorial(i-1);
    }
    
    public static void decreasing(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        decreasing(n-1);
        }
    public static void increasing(int n){
        if(n==1){
            return ;
        }
        increasing(n-1);
        System.out.println(n);
    }

    private static void minAndmax(int[] array) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}