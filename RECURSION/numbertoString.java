
import java.util.HashMap;

public class numbertoString {
    public static void main(String args[]){
        // this question is about the converting the given number to String 
        HashMap<String,String>map=new HashMap<>();
        map.put("0","Zero");
        map.put("1","One");
        map.put("2","Two");
        map.put("3","three");
        map.put("4","Four");
        map.put("5","Five");
        map.put("6","Six");
        map.put("7","Seven");
        map.put("8","Eight");
        map.put("9","Nine");
        int number=2019;
        String n="2019";
        String ans=convertToString(n,0,"",map);
        System.out.println(ans);
      
        StringBuilder s=new StringBuilder();
    }
    public static String convertToString( String n,int i,String ans,HashMap<String,String> map){
        if(i==n.length()){
            return ans;
        }
        char ch = n.charAt(i);
        String chs = String.valueOf(ch);
        if(map.containsKey(chs)){
            ans=ans+map.get(chs);

        }
        return convertToString(n, i+1, ans, map);


    }
}
