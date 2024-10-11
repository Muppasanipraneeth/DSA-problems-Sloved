
import java.util.Arrays;

public class Mergesort{
    public static void main (String args[]){
        int array[]={1 ,3, 5, 7};
        int array2[]={0 ,2, 6, 8 ,9};
        int ans[]=MergeArr(array,array2);
        System.out.println(Arrays.toString(ans));

    }public   static int [] MergeArr(int array[],int array2[]){
        int ls=0;
        int rs=0;
        int  le=array.length;
        int re=array2.length;
        int ans[]=new int[le+re];
       return  MergeArrays(array, array2,ls,rs,le,re);
         
    }
    public static int [] MergeArrays( int array[],int array2[],int ls,int rs ,int le,int re){
        int ans[]=new int[le+re];
        int i=0;
        while(ls<le && rs<re){
            if(array[ls]<=array2[rs]){
                ans[i++]=array[ls++];
                
            }else{
                ans[i++]=array2[rs++];
            }

        }
        while(ls<le){
            ans[i++]=array[ls++];
        }
        while (rs<re) {
            ans[i++]=array2[rs++]; 
            
        }


        return ans;
    }
}