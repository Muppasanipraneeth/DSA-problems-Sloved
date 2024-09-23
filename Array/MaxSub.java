
import java.lang.reflect.Array;

public class MaxSub {
    // this problem is to slove the Max Sub array
  public static void main(String[] args) {
    int array[]={5,4,-1,7,8};
    int ans=MaxSum(array);
    System.out.println(ans);
    int ans1=MAXSUM(array);
    System.out.println(ans1);


 
  }
  public static int MaxSum(int array[]){
    int max=Integer.MIN_VALUE;
    for( int i=0; i<array.length; i++){
        for( int j=i; j<array.length; j++){
            int sum=0;

            for( int k=i; k<=j; k++){
                sum=sum+array[k];

            }
            max=Math.max(sum, max);
        }
        
    }
    return max;
  }
  public static int MAXSUM( int array[]){
    // this is optimal solution 
    
    int max=Integer.MIN_VALUE;
    if(array.length==1){
        return array[0];
    }
    int currSum=array[0];
    for( int i=1; i<array.length; i++){
        currSum=Math.max(array[i], currSum+array[i]);
        max=Math.max(max, currSum);
    }
    return max;
  }
}
