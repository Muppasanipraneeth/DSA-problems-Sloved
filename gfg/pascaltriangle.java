import java.util.ArrayList;
import java.util.Scanner;

public class pascaltriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Long>ans=finding(n);
        System.out.println(ans);
    

    }
    private static ArrayList<Long> finding(int n) {
      ArrayList<ArrayList<Long>>l=new ArrayList<>();
      for (int i = 0; i < n; i++) {
        ArrayList<Long>list=new ArrayList<>();
        for (int j = 0; j <=i; j++) {
            if(j==0 || j==i){
                list.add(1L);
            }else{
                Long ans=l.get(i-1).get(j)+l.get(i-1).get(j-1);
                list.add(ans);
            }
            
        }
        l.add(list);
        System.out.println(list);
      }
      System.out.println(l);
      return l.get(n-1);
    }
}
