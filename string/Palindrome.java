public class Palindrome {
    public static void main(String[] args) {
        String a="";
        boolean ans=convertSingle(a);
        System.out.println(ans);
     
        

    }public static  boolean  convertSingle(String a){
        String ans="";
        for( int i=0; i<a.length(); i++){
            char ch=a.charAt(i);
            if((int)(ch)>=97 && (int)(ch)<=122){
                ans+=ch;

            }
            else if( (int )(ch)>=65 && ( int)(ch)<=90){
                ans+=(char)((int)(ch)+32);

            }

        }
        System.out.println(ans);
       return  checkPalindrome(ans);
    }public static boolean  checkPalindrome(String ans){
      for( int i=0 ,j=ans.length()-1; i<ans.length()/2 && j>=ans.length()/2 ;j--,i++ ){
       char first= ans.charAt(i);
       char last=ans.charAt(j);
       if(first!=last){
        return false;
       }
      }
        return true;
    }
}