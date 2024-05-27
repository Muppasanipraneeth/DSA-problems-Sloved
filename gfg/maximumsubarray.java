import java.util.ArrayList;

public class maximumsubarray {
    public static void main(String[] args) {
        int array[]={1 ,2 ,3 ,1 ,4 ,5 ,2 ,3 ,6};
        ArrayList<Integer>ans=findmax(array,3);
        System.out.println(ans);


    }

    private static ArrayList<Integer> findmax(int[] array,int k) {
ArrayList<Integer>p=new ArrayList<>();

for (int i = 0; i < array.length-k+1; i++) {
    p.add(helper(array[i],i,i+3,array));
}
return p;
    }

    private static Integer helper(int i, int start, int end, int[] array) {
        int max=array[start];
        for (int k = 0; k <end; k++) {
            if(array[k]>max){
                max=array[k];
            }
        }
        return max;
    
    }
}
