import java.math.BigInteger;
import java.util.HashMap;

public class tilling {
    public static void main(String args[]){
        int ans=tillingways(5);
        System.out.println(ans);
                HashMap<Integer,BigInteger>map=new HashMap<>();
                BigInteger ans1=tillingopt(97,map);
        System.out.println(ans1);
    }
    public static BigInteger tillingopt( int n, HashMap<Integer,BigInteger>map){
        if(n==0 || n==1){
            return BigInteger.ONE;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        BigInteger ans=tillingopt(n-1, map).add(tillingopt(n-2, map));
        map.put(n,ans);
        return ans;
    }
    public static int tillingways( int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertical =tillingways(n-1);
        int horizontal=tillingways(n-2);
        int total=vertical+horizontal;
        return total;
    }
    
}
