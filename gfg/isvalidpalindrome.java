public class isvalidpalindrome {
    public static void main(String[] args) {
        System.out.println("hello");
        String s="";
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                char c=(char)(ch+32);
                ans+=c;
            }
            if(ch>='a' && ch<='z'){
                ans+=ch;
            }
            // System.out.println(ch);
        }
        System.out.println(ans);
        boolean result=isplaindrome(ans);
        System.out.println(result);

    

    }

    private static boolean isplaindrome(String ans) {
       int ind=ans.length()-1;
       for (int i = 0; i < ans.length()/2; i++) {
        char first=ans.charAt(i);
        char last=ans.charAt(ind);
        if(first!=last){
            return false;
        }
        ind--;
       }
       return true;
    }

}
