public class FindSubsets {
    public static void main(String args[]){
        subsets("abcd",0,"");
    }public static void subsets(String a,int i,String p){
        if(i==a.length()){
            System.out.println(p);
            return ;

        }
        char ch=a.charAt(i);
        subsets(a, i+1,p+ch);
        subsets(a, i+1,p);
    }
}
