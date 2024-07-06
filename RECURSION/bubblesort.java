import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        int array[]={5,3,2,1,0};
        bubblesorting(array,array.length-1,0);
        System.out.println(Arrays.toString(array));
        // its working
        
    }
    public  static void bubblesorting(int array[],int row,int col){
        if(row==0){
            return ;
        }
        if(col<row){
            if(array[col]>array[col+1]){
            int temp=array[col];
             array[col]=array[col+1];
             array[col+1]=temp;
            }
            bubblesorting(array, row, col+1);
        }else{
            bubblesorting(array, row-1, 0);
        }
    }
}
