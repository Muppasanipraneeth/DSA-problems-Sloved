import java.util.Arrays;
// this question is in leetcode -  14  longest common prefix 

public class longestprex {
    public static void main(String[] args) {
        String[] a = {"flower", "flow", "flight"};
        Arrays.sort(a);
        String ans=commonprefix(a);
        System.out.println(ans);
    }
    public static String commonprefix(String []a){
        Arrays.sort(a);
    String s1=a[0];
    String s2=a[a.length-1];
    int ind=0;
    while(ind<s1.length() && ind<s2.length()){
        if(s1.charAt(ind)==s2.charAt(ind)){
            ind++;
        }else{
            break;
        }

    }
    return s1.substring(0, ind);
    }
}
