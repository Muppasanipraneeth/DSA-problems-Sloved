import java.util.*;
public class decnumbers{
    public static void main(String args[]){
        // this program is about the dec and the inc the numbers throught the recursion
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number");
        int num=sc.nextInt();
        inc(0,num);
        dec(10);
        sc.close();
    }
    public static void inc(int n,int num){
        if(n>num){
            return ;
        }
        System.out.println(n);
        inc(n+1,num);
    }
    public static void dec( int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        dec(n-1);
    }
}