import java.util.*;
public class findpeak {
    public static void main(String[] args) {
        List<Integer>p=new ArrayList<>(Arrays.asList(1 ,2 ,3 ,4, 5, 6, 5 ,4 ,3 ,2 ,1));
        int ans=find(p);
        
    }

    private static int find(List<Integer> p) {
        int max=Integer.MIN_VALUE;
       for (int i = 0; i < p.size(); i++) {
        if(p.get(i)>max){
            max=p.get(i);
        }
       }
       return max;
    }
}
