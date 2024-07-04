import java.util.*;
public class reversestack {// this problem is about the reversing the stack by using the recursion  and other without using the recursion
    public static void main(String args[]){
        Stack<Integer>s =new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        revsering(s);
        System.out.println(s);
    }

    private static void revsering(Stack<Integer> s) {
     if(!s.isEmpty()){
        int temp=s.pop();
        revsering(s);
        insertbottom(s,temp);
     }
       
    }

    private static void insertbottom(Stack<Integer> s, int temp) {
       if(s.isEmpty()){
        s.add(temp);
       }else{
        int k=s.pop();
        insertbottom(s, temp);
        s.add(k);
       }
    }

    private static Stack<Integer> revser(Stack<Integer> s) {
        Stack<Integer>temp=new Stack<>();
    while(!s.isEmpty()){
        temp.add(s.pop());
    }
    return temp;
    }

}
