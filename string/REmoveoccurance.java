import java.util.*;
class REmoveoccurance{
    public static void main(String args[]){
        String s="axxxxyyyyb";
        String p="xy";
        String ans =Removeoccurance(s,p);
        System.out.println(ans);

    }
    public static String Removeoccurance(String s, String p){
        Stack<Character> st=new Stack<>();
        int ple=p.length();
        boolean match=false;
    for (char ch : s.toCharArray()) {
        st.push(ch);

        if(st.size()>=ple){
            match=true;
            for(int i=0; i<p.length();i++){
                if (st.get(st.size() - ple + i) != p.charAt(i)) {
                    match=false;
                    break;
                    
                }

            }
            if(match){
                for (int i = 0; i < ple; i++) {
                    st.pop();
                    
                }
            }

        }
        
    }
    StringBuilder ans=new StringBuilder();
    for (Character c : st) {
        ans.append(c);
    }
    return ans.toString();


    }
}