import java.util.ArrayList;

public class ReverseStr {
    public static void main (String args[]){
        String a="a good   example";
        String ans=reverse(a);
        System.out.println(ans);

    }public static String reverse(String a){
        ArrayList<String >s=new ArrayList<>();
        String part="";
    
        for (int i = 0; i < a.length(); i++) {
            char ch=a.charAt(i);

            if (ch !=' ' ) {
                part+=ch;
           

            }else if (!part.isEmpty()) {
                s.add(part);
                part="";
                
            }
            
        }
        if(!part.isEmpty()){
            s.add(part);
        }
        System.out.println(s);
        StringBuilder ans=new StringBuilder();
   
        for (int i = s.size()-1; i >=0; i--) {
            ans.append(s.get(i));
            if(i!=0){
                ans.append(" ");
            }
          
        }
        return ans.toString();
    }
    
}
