import java.util.*;
public class Removestar {
    public static void main(String[] args) {
        // String s="leet**cod*e";
        String s="erase*****";
       String ans=removeStar(s);
       System.out.println(ans);
        
    }public static String removeStar(String s){
        String ans="";
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                stack.pop();
            }else{
                stack.add(s.charAt(i));
            }
        }
        Stack<Character>temp=new Stack<>();
        while(!stack.isEmpty()){
            temp.add(stack.pop());

        }
        while(!temp.isEmpty()){
            char ch=temp.pop();
            stack.add(ch);
            ans+=ch;
        }

        return ans;

    }
}
