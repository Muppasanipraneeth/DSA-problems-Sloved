
import java.util.Arrays;

public class ArrayQues{
    public static void main(String args[]){
        int []array=new int[5];
        changeArr(array,0,1);
        System.out.println(Arrays.toString(array));
    }
    public static void changeArr(int []array,int i,int value){
        if(i==array.length){
            System.out.println(Arrays.toString(array));
return ;
        }
        array[i]=value;
        changeArr(array, i+1, value+1);
        array[i]=array[i]-2;
    }
}