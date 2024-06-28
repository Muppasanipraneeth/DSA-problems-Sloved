public class compress {
    public static void main(String[] args) {
        char ch[]={'a','a','b','b','c','c','c'};
        int ans=compression(ch);
        System.out.println(ans);
    }

    private static int compression(char[] ch) {
        String ans="";
        char prev='1';
        int count=1;
        for (int i = 0; i < ch.length; i++) {
            if(prev!=ch[i]){
                ans=ans+ch[i];
            }
            
            if(prev==ch[i]){
                count++;
            }else if(i!=0 && prev!=ch[i]){
                ans=ans+count;
                count=1;
            }
            prev=ch[i];
            
        }
        System.out.println(ans);
        return ans.length();
    }
}
