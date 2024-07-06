
import java.util.Arrays;

public class mergearrays {
    // this is merge  the two array a normal method
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int array2[]={0,2,5,9,10};
        int ans[]=merging(array,array2);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] merging(int []array,int []array1){//this method is by the loops
        int ans[]=new int [array.length+array1.length-2];
        int ls=0;
        int rs=0;
        int le=array.length-1;
        int re=array1.length-1;
        int i=0;
        while(ls<le && rs<re){
            if(array[ls]<array1[rs]){
                ans[i]=array[ls];
                i++;
                ls++;
            }else{
                ans[i]=array1[rs];
                i++;
                rs++;
            }
        }
        while(ls<le){
            ans[i]=array[ls];
            ls++;
            i++;
        }
        while(rs<re){
            ans[i]=array1[rs];
            i++;
            rs++;
        }
        return ans;

    }
}
