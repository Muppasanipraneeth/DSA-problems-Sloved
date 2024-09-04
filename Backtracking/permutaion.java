public class permutaion{
    public static void main (String args[]){
        // this is the printing the permutaions
        
permutaions("abc","");
    }
    public static void permutaions(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);   
        }
        for( int i=0 ; i<s.length(); i++){
            char ch=s.charAt(i);
            String newStr=s.substring(0, i)+s.substring(i+1);
            permutaions(newStr, ans+ch);
        }
    }
}