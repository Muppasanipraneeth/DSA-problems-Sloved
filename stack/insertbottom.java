import java.util.Stack;

public class insertbottom {
    public static void main( String args[]){
        Stack<Integer>s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s);
        int x=10;
        Stack<Integer> k=insertbottm(s,x);
        System.out.println(k);
        Stack<Integer>ans=insertb(s,x);
        System.out.println(ans);
    }

    private static Stack<Integer> insertbottm(Stack<Integer> s, int x) {
    Stack<Integer>temp=new Stack<>();
    while(!s.isEmpty()){
        temp.add(s.pop());
    }
    s.add(x);
    while (!temp.isEmpty()) {
        s.add(temp.pop());
        
    }
    return s;
    }

    private static Stack<Integer> insertb(Stack<Integer> s, int x) {
      if(s.isEmpty()){
        s.add(x);
      }else{
        int temp=s.pop();
      insertb(s, x);
      s.add(temp);
      }
  return s;    
    }
}
