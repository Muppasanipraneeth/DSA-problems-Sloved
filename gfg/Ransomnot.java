import java.util.Hashtable;

public class Ransomnot {
    public static void main(String[] args) {
        String ransomNote="a";
        String magazine="b";
        boolean result=canConstruct(ransomNote,magazine);
        System.out.println(result);
    
    }
    private static boolean canConstruct(String ransomNote, String magazine) {
        Hashtable<Character,Integer>map=new Hashtable<>();
        

       for (int i = 0; i < magazine.length(); i++) {
        char ch=magazine.charAt(i);
        map.put(ch,map.getOrDefault(ch, 0)+1);
        
       }
       System.out.println(map);
       for (int i = 0; i < ransomNote.length(); i++) {
        char ch=ransomNote.charAt(i);
        System.out.println(ch);
        if(!map.containsKey(ch)){
            return false;
        }
        if(map.containsKey(ch)){
            int value=map.get(ch)-1;
          map.put(ch,  value);
          if(value==0){
            map.remove(ch);
          }
        }
        
       }
       System.out.println(map);
       return true;
    }
}
