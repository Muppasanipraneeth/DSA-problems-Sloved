public class MinAndmax{
    public static void main(String args[]){
        int []array={3, 2, 1, 56, 10000, 167};
        findMinMax(array,array[0],0,0);
    }
    public static void findMinMax(int []array,int min ,int max,int i){
        if(i==array.length){
            System.out.println(min);
            System.out.println(max);
            return ;
        }
        if(array[i]<min){
            min=array[i];
        }
        if(array[i]>max){
            max=array[i];
        }
        findMinMax(array,min,max,i+1);
    }
}