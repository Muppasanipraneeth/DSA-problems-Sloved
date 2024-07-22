import java.util.*;
import java.util.Stack;
import javax.lang.model.element.Element;
public class sortstack{
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
s.add(5);
s.add(4);
s.add(3);
s.add(2);
s.add(1);
        System.out.println(s);

        Stack<Integer>ans=sorting(s);
        System.out.println(ans);
    }
    public static Stack<Integer> sorting(Stack<Integer>s){
        if(s.isEmpty()){
            return s;
        }
        int element=s.pop();
        sorting(s);
        Insertsort(s,element);
    
        return s;
    }
    public static void Insertsort(Stack<Integer> s,int element){
        if(s.isEmpty() || s.peek() <=element){
            s.push(element);
            return;
        }
        int top=s.pop();
        Insertsort(s, element);
        s.push(top);
    }
}