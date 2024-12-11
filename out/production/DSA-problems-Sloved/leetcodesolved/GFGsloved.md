### GFG sloved solutions
- this quesiton is about return the second larges elememt form the array and return -1 if it doestn't exist
```java
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






### union of two array
import java.util.HashSet;

public class unionarray {
    public static void main(String[] args) {
        int array[]={1 ,2 ,3 ,4 ,5};
        int array2[]={1,2,9};
        HashSet<Integer>h=new HashSet();
        for (int i : array2) {
            h.add(i);
        }
        for (int i : array) {
            h.add(i);

        }
        System.out.println(h.size());
    }
}
 

 ### valid anagram
 private static boolean find(String s1, String s2) {
        Queue<Character>q=new LinkedList<>();
        for (int i = 0; i < s1.length(); i++) {
         q.add(s1.charAt(i));   
        }
        for (int i = 0; i < s2.length(); i++) {
            if(q.contains(s2.charAt(i))){
                q.remove(s2.charAt(i));
            }else{
                return false;
            }
            
        }
        return true;
    }