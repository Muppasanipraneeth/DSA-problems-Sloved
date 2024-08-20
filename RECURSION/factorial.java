public class factorial {
    public static void main (String args[]){
        // this program is about the factorial of the number 
        System.out.println("hello");
        int ans=fact(5);
        System.out.println(ans);
    }public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

}
