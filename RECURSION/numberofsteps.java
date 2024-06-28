public class numberofsteps {
    public static void main(String[] args) {
        int n=8;
        int ans=numberofstep(n,0);
        System.out.println( ans);
    }
    public static int numberofstep(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            n=n/2;
            count++;
        }else{
            n=n-1;
            count++;
        }
        return numberofstep(n, count);

    }
}
