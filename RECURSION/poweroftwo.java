public class poweroftwo {
    public static void main (String args[]){
    // this problem is about if the given number is power of 2 or not
// this is approach 1
    boolean ans =power_two(1);
    System.out.println(ans);
// this is approach 2
    boolean ans1=poweroftwo(1);
System.out.println(ans1);
  
    }
    public static boolean poweroftwo( int n){
        if(n<=0){
            return false;
        }
        int k=n& (n-1);
       return k==0 ? true:false;
    }
    public static boolean power_two( int n){
        if(n==1){
            return true;
        }
        if(n<=0 || n%2!=0){
            return false;
        }
        return power_two(n/2);
        
    }
}
