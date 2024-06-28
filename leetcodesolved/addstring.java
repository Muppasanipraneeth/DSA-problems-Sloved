import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class addstring{
    public static void main(String[] args) {
        String a="11";
        String b="12";
        String ans=adding(a,b);
        System.out.println(ans);

    }
    private static String adding(String s1, String s2) {
        Stack<Integer> stack = new Stack<>();
        int carry = 0;
        int i = s1.length() - 1;
        int j = s2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? s1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? s2.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            stack.push(sum % 10);
            carry = sum / 10;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
   
}// other approach which i have spent lot time to discover this
/* public static void main(String args[]){
        String s1="456";
        String s2="7";
        String ans=adding(s1,s2);
        System.out.println(ans);
    }

    private static String adding(String s1, String s2) {
      ArrayList<Integer>array1=new ArrayList<>();
      ArrayList<Integer>array2=new ArrayList<>();
      for (int i = 0; i < s1.length(); i++) {
        array1.add(s1.charAt(i)-'0');
        
      }
      for (int i = 0; i < s2.length(); i++) {
        array2.add(s2.charAt(i)-'0');
      }
        Collections.reverse(array1);
        Collections.reverse(array2);
        return find(array1,array2);
    }

    private static String find(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        String ans="";
        int l1=0;
        int l2=0;
        int r1=array1.size()-1;
        int r2=array2.size()-1;
        int sum=0; 
        int carry=0;
        Stack<Integer>s=new Stack<>();
        boolean check=false;
        while (l1<=r1 && l2<=r2) {
            check=false;
            int sum1=array1.get(l1);
            int sum2=array2.get(l2);
            sum=sum1+sum2+carry;
            if(sum>9){
                carry=sum%10;
                sum=sum/10;
                check=true;
            }
            s.add(sum);
            sum=0;

            




            l1++;
            l2++;
            
        }
        if(l1!=r1&&check){
            int a=array1.get(l1)+carry;
            l1++;
            s.add(a);
        }
        if(l2!=r2&&check){
            int a=array1.get(l2)+carry;
            s.add(a);
            l2++;
        }

        while (l1<=r1) {
            s.add(array1.get(l1));
            l1++;
            
        }
        while(l2<=r2){
            s.add(array2.get(l2));
            l2++;
        }
        while (!s.isEmpty()) {
            ans+=s.pop();
            
        }
        return ans;
       
    } */