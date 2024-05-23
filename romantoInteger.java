import java.util.HashMap;

public class romantoInteger {
    public static void main(String args[]){
//  I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
HashMap<Character,Integer>map=new HashMap<>();
map.put('I', 1);
map.put('V', 5);
map.put('X', 10);
map.put('L', 50);
map.put('C', 100);
map.put('D', 500);
map.put('M', 1000);
String s="MCMXCIV";
// int ans=converting(map,s);
int ans1=converting1(map,s);
System.out.println(ans1);
    }

    private static int converting1(HashMap<Character, Integer> map, String s) {
      int result=0;
      for (int i = 0; i < s.length(); i++) {
        int currentvalue=map.get(s.charAt(i));
        // System.out.println(currentvalue);
        if(i+1<s.length() && currentvalue<map.get(s.charAt(i+1))){
        
            // int value=map.get(s.charAt(i+1));
            // System.out.println(value);
            result=result+map.get(s.charAt(i+1))-currentvalue;
            i++;
        }else{
            result=result+currentvalue;
        }
      }
      return result;
    }

    private static int converting(HashMap<Character, Integer> map, String s) {
        int result=0;
    for (int i = 0; i <=s.length()-1; i++) {
        char ch=s.charAt(i);
        if(ch=='M'){
            int ans=map.get(ch);
            result=result+ans;

        }else if(ch=='C' && i+1<s.length()){
            if(s.charAt(i+1)=='D'){
                result=result+400;
                i++;

            }else if(s.charAt(i+1)=='M'){
                result=result+900;
                i++;


            }else{
                result=result+map.get(ch);

            }
        }else if(ch=='X'  && i+1<s.length()){
            if(s.charAt(i+1)=='L'){
                result=result+40;
                i++;

            }else if(s.charAt(i+1)=='C'){
                result=result+90;
                i++;


            }else{
                result=result+map.get(ch);

            }
        }else if(ch=='I' && i+1<s.length()){
            if(s.charAt(i+1)=='V'){
                result=result+4;
                i++;

            }else if(s.charAt(i+1)=='X'){
                result=result+9;
                i++;


            }else{
                result=result+map.get(ch);

            }
        }else{
            result=result+map.get(ch);
        }
        System.out.println(result);
     
        
    }
    return result;
    }
}
