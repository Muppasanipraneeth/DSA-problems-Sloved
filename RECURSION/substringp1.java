public class substringp1 {
    public static void main(String[] args) {
        // this question is about the removing the character from the  string 
        String a="abssbacaa";
        // String ans=removea(a,0,"");
        // System.out.println(ans);
        // removingchar("",a);
        System.out.println(removingchar1(a));
        // here if we want skip for the entire string we can do that also with same
        String s="macantoschsayapplehii";
        System.out.println(skipapple(s));
        System.out.println(skipappnotapple(s));
    }
    public static String skipappnotapple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipappnotapple(s.substring(3));
        }else{
            return s.charAt(0)+skipappnotapple(s.substring(1));
        }
    }

    public static String skipapple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipapple(s.substring(5));
        }else{
            return s.charAt(0)+skipapple(s.substring(1));
        }
    }
    public static String removingchar1(String a){
        if(a.isEmpty()){
            return "";
        }
       char  ch=a.charAt(0);
        if(ch=='a'){
            return removingchar1(a.substring(1));
        }else{
            return ch+removingchar1(a.substring(1));
        }
    }
    public static void removingchar(String ans,String a){
        if(a.isEmpty()){
            System.out.println(ans);
            return ;
        }
        char ch=a.charAt(0);
        if(ch=='a'){
            removingchar(ans, a.substring(1));
        }else{
            removingchar(ans+ch, a.substring(1));
        }
    }
    public static String removea(String a,int i,String ans){
    if(i==a.length()){
        return ans;
    }
    if(a.charAt(i)=='a'){

    }else{
        ans=ans+a.charAt(i);
    }
    return removea(a, i+1, ans);
    }
}
