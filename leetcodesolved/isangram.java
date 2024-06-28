import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class isangram {
    public static void main(String[] args) {
        String s1="allergy";
        String s2="allergic";
        boolean ans= find(s1,s2);
        System.out.println(ans);

    }

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
}
