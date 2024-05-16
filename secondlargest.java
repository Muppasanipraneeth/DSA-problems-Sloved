import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        int array[]={642 ,642, 642 ,642 ,642, 642 ,642 ,642 ,642 ,642, 642 ,642 ,642 ,642 ,642,642 ,642, 642, 642, 642 ,642};
        HashSet<Integer> uniqueElements = new HashSet<>();
        System.out.println("hello");
        for (int i : array) {
            uniqueElements.add(i);
        }
        System.out.println(uniqueElements);
        PriorityQueue<Integer>l=new PriorityQueue<>();
        for (int i : uniqueElements) {
            l.add(i);
            if(l.size()>2){
                l.poll();
            }

        }
        if(l.size()==1){
            System.out.println(-1);
        }
        System.out.println(l.poll());
    

    }
}
