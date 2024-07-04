

import java.util.*;

public class insertsection {
    public static void main(String args[]){
        int array1[]={1,2,2,1};
        int array2[]={2,2};
        int ans[]=intersectionof(array1,array2);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] intersectionof(int []array1,int []array2){
        HashMap<Integer,Integer>map=new HashMap<>();
        for( int i=0; i<array1.length;i++){
            map.put(array1[i],map.getOrDefault(array1[i], 0)+1);
        }
        ArrayList<Integer>array=new ArrayList<>();
        for( int i=0; i<array2.length;i++){
            if(map.containsKey(array2[i])){
                int value=map.get(array2[i]);
                if(value-1>=0){
                    array.add(array2[i]);
                }
                map.put(array2[i],map.getOrDefault(array2[i], value)-1);
            }
        }
        int size=array.size();
        int i=0;
        int []a=new int[size];
for (Integer k : array) {
a[i]=k ;
i++;   
}
       return a;
    }
}
