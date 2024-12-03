package Array;

public class Countpair {
    public static void main(String[] args) {
        int array[]={2, 3, 5, 7};
        int target=8;
        int ans=count(array,target);
        System.out.println(ans);
    }
    public  static  int count(int array[],int target){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]>target){
                    break;
                }
                if(array[i]+array[j]<target){
                    count++;
                }

            }
        }

        return count;

    }
}
