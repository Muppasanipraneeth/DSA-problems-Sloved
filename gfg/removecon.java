public class removecon{// this quesiton number 43 from the shradha sheet
    public static void main(String args[]){
        String a="aabba";
        System.out.println(a);
        System.out.println(removeCon(a,'.'));
    }public static String removeCon(String a,char prev){
        if(a.isEmpty()){
            return "";
        }
        char ch=a.charAt(0);
        if(ch==prev){
            return removeCon(a.substring(1), ch);
        }else{
            return ch+ removeCon(a.substring(1), ch);
        }
    }
}