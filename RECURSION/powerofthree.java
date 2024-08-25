public class powerofthree {
    public static void main(String[] args) {
        boolean ans=power_three(-1);
        System.out.println(ans);
    }
    public static boolean power_three( int n){
        if(n<=0){
            return false;
        }
        for( int i=0;  i<=23; i++){
            int ans=power(3,i);
            if(n==ans){
                return  true;
            }
        }
        return false;
    }
    public static int power( int n,int i){
        if(i==0){
            return 1;
        }
        return n*power(n,i-1);

    }
}
