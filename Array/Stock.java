import java.util.*;
public class Stock{
    public static void main(String agrs[]){
        int array[]={7,6,4,3,1};
        System.out.println(Arrays.toString(array));
        int maxprice=Buysell(array);
        System.out.println(maxprice);

        
    }
    public static int Buysell( int []array){
        int max_profit=0;
        int buy_price=Integer.MAX_VALUE;
        for( int i=0; i<array.length; i++){
            if(buy_price<array[i]){
                max_profit=Math.max(array[i]-buy_price, max_profit);
            }else{
                buy_price=array[i];
            }

        }
        return max_profit;
    }

}