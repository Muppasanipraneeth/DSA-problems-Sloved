import java.util.Stack;

public class minstack {
    static Stack<Integer>s=new Stack<>();
    public class MinStack{
      
        
    }
    public void push(int val){
        if(s.isEmpty()){
            s.add(val);
            return ;
        }
        if(val>s.peek()){
            s.add(val);
        }else{
            Stack<Integer>p=new Stack<>();
            while ((s.peek()>val)) {
                System.out.println(s.peek());
                p.add(s.pop());
                
                
            }
            s.add(val);
            while (!p.isEmpty()) {
                s.add(p.pop());
                
            }
            return ;
        }
        

    }
    public void pop(){
         s.remove(0);
         return;   
    }
    public int top(){
        return s.peek();
    }
    public int getMin(){
        return s.get(0);
    }

    public static void main(String[] args) {
        minstack k=new minstack();
    
        k.push(-2);
        k.push(0);
        k.push(-3);
        System.out.println(" the minvalue "+k.getMin());
        k.pop();
        System.out.println(" the top value is"+k.top());
        System.out.println(" the minvalue "+k.getMin());



    }
}
