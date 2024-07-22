import java.util.*;
public class subarray{
    public static void main(String args[]){
        int array[]={1,2,3,4};
        ArrayList<Integer>ans=subarr(array);
    }
    public static ArrayList<Integer>subarr(int array[]){
        ArrayList<ArrayList<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for( int num: array){
            int n=outer.size();
            
            for( int i=0;i<n; i++){
                ArrayList<Integer>inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            
            }
        }
      
        ArrayList<Integer>ans=new ArrayList<>();
        for (ArrayList<Integer> arrayList : outer) {
            int sum=0;
            for (Integer integer : arrayList) {
                sum=sum+integer;
                
            }
            ans.add(sum);
        }
        System.out.println(ans);
        return ans;
    }
}