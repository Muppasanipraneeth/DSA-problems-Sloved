
import java.util.ArrayList;

public class printpattern {
    public static void main(String args[]) {
        int n=16;
        ArrayList<Integer>ans=patterns(n);
        System.out.println(ans);

    }
    public static ArrayList<Integer>patterns(int n){
        ArrayList<Integer>ans=new ArrayList<>();
        pattern(n,false,n,ans);
        return ans;
    }

    public static void pattern(int n, boolean left,int orginal,ArrayList<Integer>ans) {
        ans.add(n);

        
        if (n <= 0) {
            left = true;
        }

        if (!left) {
            pattern(n - 5, left,orginal,ans);
        } 
        else if ( left && n < orginal) {
            pattern(n + 5, left,orginal,ans);
        }
    }
}
