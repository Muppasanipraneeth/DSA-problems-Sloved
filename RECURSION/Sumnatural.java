public class Sumnatural {
    public static void main(String[] args) {
        // this program is about the printing the sum n natural numbers
        int ans=sum(3);
        System.out.println(ans);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}
