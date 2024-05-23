import java.util.ArrayList;

public class greatestcansie {
    public static void main(String[] args) {
        int array[]={2,3,5,1,3};
        int extracandie=3;
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        ArrayList<Boolean>l=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int ans=array[i]+extracandie;
            if(ans>=max){
                l.add(true);
            }else{
                l.add(false);
            }
            
        }
        System.out.println(l);

    }
}
