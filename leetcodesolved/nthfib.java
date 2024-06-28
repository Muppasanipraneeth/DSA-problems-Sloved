public class nthfib {
    public static void main(String[] args) {
        int n=2;
        int ans=fibo(14521);
        System.out.println(ans);
    }

    private static int fibo(int n) {
       int prev1=1;
       int prev2=1;
       int ans=1;
       for (int i = 2; i <n; i++) {
        ans=prev1+prev2;
        prev1=prev2;
        prev2=ans;


       }
       return ans;
    }
}
