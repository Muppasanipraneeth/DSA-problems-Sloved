public class fibonacci {
    public static void main(String[] args) {
        // this poragram is about the fibonacci number  and to find the nth fibonacci number
        int ans =ficbonaci(8);
        System.out.println(ans);
    }
    public static int ficbonaci( int n){
        if(n==1 ||n==0){
            return n ;
        }
        return ficbonaci(n-1)+ficbonaci(n-2);
    }
}
