package Array;

public class Makepalindrome {
    // this is not correct for more case so wrong
    public static void main(String[] args) {
        String s="aacecaaaa";
        int i=0;
        int j=s.length()-1;
        int count=0;
        while (i<j && i!=j){
            char frnt=s.charAt(i);
            char last=s.charAt(j);
            if(frnt==last){
                i++;
                j--;
            } else if (frnt!=last) {
                j--;
                count++;
            }
        }
        System.out.println(count);
    }
}
