import java.lang.reflect.Array;
import  java.util.*;
public class subsets {
    public static void main(String[] args) {
        int array[]={5,2,1};
        ArrayList<Integer>a=new ArrayList<>();
        a.add(5);
        a.add(2);
        a.add(1);
        ArrayList<Integer>l=new ArrayList<Integer>();
        l.add(0);
        for (int i = 0; i < a.size(); i++) {
            for (int j = i ; j < a.size(); j++) {
                int sum=0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum=sum+a.get(j2);
                }
                l.add(sum);
            }
        }
        Collections.sort(l);
        System.out.println(l);
        ArrayList<ArrayList<Integer>>ans=sum(array);
        System.out.print(ans);
    }

    private static ArrayList<ArrayList<Integer>> sum(int []array) {
        ArrayList<ArrayList<Integer>>outer=new ArrayList<>();
outer.add(new ArrayList<>());
for( int num : array){
    int n=outer.size();
    for(int i=0; i<n; i++){
        ArrayList<Integer> inner=new ArrayList<>(outer.get(i));
        inner.add(num);
        outer.add(inner);
    }

}
ArrayList<Integer>ans=new ArrayList<>();
for (ArrayList<Integer> arrayList : outer) {
    int sum=0;
    for (Integer v : arrayList) {
sum=sum+v;
        
    }
    ans.add(sum);
}
System.out.println(ans);
      
       return outer;
    }

}
