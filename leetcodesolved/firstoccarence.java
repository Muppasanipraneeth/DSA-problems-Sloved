public class firstoccarence {
    public static void main(String[] args) {
        String haystack="mississippi";
        String needle="issip";
        int ans=firstoccarence(haystack,needle);
        System.out.println(ans);
    }

    private static int firstoccarence(String haystack, String needle) {
      int ans=-1;
      int count=0;
      

      for (int i = 0; i < haystack.length(); i++) {
        char ch=haystack.charAt(i);
        char n=needle.charAt(count);
        if(ch==n){
            if(count==0){
                ans=i;
            }else if(count==needle.length()-1){
                return ans;
            }
            count++;
        }else{
            ans=-1;
            count=0;
        }
        
      }
      return ans;
    }
}
