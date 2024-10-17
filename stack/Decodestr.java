import java.util.Stack;

public class Decodestr {
    public static void main (String agrs[]){
        String s="3[a]2[bc]";
        Stack<Character>stack=new Stack<>();
        for( int i=0; i<s.length();i++){
            if(s.charAt(i)==']'){

                while (s.charAt(i)!='[' && stack.isEmpty()) {
                    System.out.println(stack.pop());                    
                }
            }else{
                stack.add(s.charAt(i));

            }
        }
        System.out.println(stack);
    }
    
}
