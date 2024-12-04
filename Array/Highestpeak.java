package Array;

public class Highestpeak {
    public static void main(String[] args) {
        int array[]={-4,-3,-2,-1,4,3,2};
        int peaks[]=new int[array.length+1];
        peaks[0]=0;
        for (int i = 0; i < array.length; i++) {
            peaks[i+1]=peaks[i]+array[i];

        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < peaks.length; i++) {
            if(peaks[i]>max){
                max=peaks[i];
            }

        }
        System.out.println(max);
    }
}
