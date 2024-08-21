public class lenghtOfString {
    public static void main(String[] args) {
        String s="praneeth";
        int ans=findlenght(s,0);
        System.out.println(ans);
    }
    public static int findlenght( String s,int i){
        if(i==s.length()){
            return i;
        }
        return findlenght(s, i+1);
    }
}
