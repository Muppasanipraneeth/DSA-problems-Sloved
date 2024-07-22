import java.util.*;
class threesum{
    public static void main(String args[]){
        int array[]={0, -1, 2, -3, 1};
        boolean ans=verifying(array);
        System.out.println(ans);
    }
    public static boolean verifying( int []array){
        Arrays.sort(array);
        for( int i=0; i<=array.length-2; i++){
            int start=i+1;
            int end=array.length-i;
            while(start<end){
                int ans=array[i]+array[start]+array[end];
                if(ans==0){
                    return true;
                }else if(ans>0){
                    end--;
                }else{
                    start++;
                }

            }

        }
        return false;
    }
}