public class power {// this power x^n normal and optimized version code
    public static void main(String args[]){
        long ans=power(2,50);
        System.out.println(ans);
        System.out.println(poweropt(2, 200));

    }
    public static long power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power( x,n-1);
    }
    public static long poweropt( int x,int n){
        if(n==0){
            return 1;
        }
        long half=poweropt(x, n/2);
       long  halfseq=half*half;
       if(!(n%2==0)){
        halfseq=x*half*half;
       }
       return halfseq;

    }
}
