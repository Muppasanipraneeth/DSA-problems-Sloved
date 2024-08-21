import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        // this problem is about removing the duplicates from the string
        String s="appnacollege";
        int array[]=new int[26];
        String ans=removedup(s,array,"",0);
        System.out.println(ans);
    
    }
    public static String removedup( String s,int array[],String ans,int i){
        if(i==s.length()){
            return ans;
        }
        char ch=s.charAt(i);
        if((array[ch-'a']==0)){
            ans=ans+ch;
            array[ch-'a']++;

        }
           return   removedup(s, array, ans, i+1);
        
        
    }
}
