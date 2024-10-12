import java.util.*;
public class IsSubStr{
    //392. Is Subsequence Leetcode
    public static void main(String[] args) {
        String up="ahbgdc";
        String check="abc";
        ArrayList<String>all=new ArrayList<>();
        ArrayList<String>ans=sub("",up,all);
        boolean a=doesContain(all,check);
        System.out.println(a);
        System.out.println(all);
       boolean finalsol= isSub(up,check);
       System.out.println(finalsol);


    }
    public static boolean isSub(String up,String check){
        int i=0;
        int j=0;
        while(i<check.length() && j<up.length()){
            if(up.charAt(j)==check.charAt(i)){
                i++;

            }
            j++;
        }
        return i==check.length();

    }
    // this code works but it take to much memory so to optimzie this 
    public static boolean doesContain(ArrayList<String> all,String check){
        return all.contains(check);
    }
    public static ArrayList<String> sub(String p,String up,ArrayList<String> all){
        if(up.isEmpty()){
            all.add(p);
            return all;
        }
        char ch=up.charAt(0);
        sub(p+ch,up.substring(1),all);
        sub(p,up.substring(1),all);
        return all;

    
        
    }
}