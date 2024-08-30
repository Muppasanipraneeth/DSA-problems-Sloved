public class powerOfnumber {
public static void main (String args[]){
    int n=12;
    int r=21;
    long ans=powerOf(n,r)/1000000007;
    System.out.println(ans);
}
public static long powerOf( int n,int r){
    if(r==1){
        return 1;
    }
    return n*powerOf(n, r-1);
}
}
