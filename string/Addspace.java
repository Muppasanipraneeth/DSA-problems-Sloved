package string;

import java.util.Arrays;
// 2109. Adding Spaces to a String

public class Addspace {
    public static void main(String[] args) {
        String s="spacing";
        System.out.println(s);
        int spaces[]={0,1,2,3,4,5,6};
        System.out.println(Arrays.toString(spaces));
        StringBuilder ans=new StringBuilder();
        int count=0;
        System.out.println(spaces.length);
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( count!=spaces.length &&spaces[count]==i){
                ans.append(" "+ch);
                count++;
            }else{
                ans.append(ch);
            }


        }
        System.out.println(addSpaces(s,spaces));
    } public  static String addSpaces(String s, int[] spaces) {
        StringBuilder ans=new StringBuilder();
        int count=0;
        System.out.println(spaces.length);
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( count!=spaces.length &&spaces[count]==i){
                ans.append(" "+ch);
                count++;
            }else{
                ans.append(ch);
            }


        }
        System.out.println(ans);
        return ans.toString();



    }

}
