class linkedlistpalindrome{//this question is about from the linked list 
       public static void main(String args[]){
        String a="abcdba";
        boolean ans=ispalindrome(a);
        System.out.println(ans);
    }
    public static boolean ispalindrome(String a){
        int n=a.length()-1;
        for (int i = 0; i <=a.length()/2; i++) {
            if(a.charAt(i)!=a.charAt(n)){
                return false;
            }
            n--;
            
        }
        return true;
    }
}