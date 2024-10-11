public class Vowelrev {

public static void main(String[] args) {
    String a="IceCreAm";
    String ans=reversevowel(a);
    System.out.println(ans);
}public static String reverse(String a){
   
    char str[]=a.toCharArray();
    int prev=str.length-1;
    for (int i = 0; i < str.length/2; i++) {
        char ch=str[i];
        if(isvowel(ch)){
            for (int j = prev; j>i; j--) {
                char ch1=str[j];
                if (isvowel(ch1)) {
                    char temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                    prev = j - 1;  
                    break;
                }
                
            }

        }
        
    }
    
    return new String(str);
}
public static String reversevowel(String a){
    char str[]=a.toCharArray();
    int start=0;
    int end=str.length-1;
    while (start<end) {
    while(start<end && !isvowel(str[start])){
        start++;
    }
    while(start<end && !isvowel(str[end])){
        end--;
    }
    char temp=str[start];
    str[start]=str[end];
    str[end]=temp;
    start++;
    end--;
        
    }
    return  new String(str);
}
public static boolean  isvowel(char ch){
    return  "AEIOUaeiou".indexOf(ch)!=-1;
}
}