import java.util.ArrayList;

public class subset {
    public static void main(String args[]){
        String a="abc";
        subsets(a,"");
        System.out.println(sub(a,""));
    }public static void subsets(String a,String p){
        if(a.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=a.charAt(0);
        subsets(a.substring(1), p+ch);
        subsets(a.substring(1), p);
    }public static ArrayList<String> sub(String s,String a){
        if(s.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(a);
            return list;
        }
        char ch=s.charAt(0);
        ArrayList<String> left=sub(s.substring(1),a+ch);
        ArrayList<String> right=sub(s.substring(1),a);
        left.addAll(right);
        return left;
    }
}
