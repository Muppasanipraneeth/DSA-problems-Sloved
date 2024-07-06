
import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int array[]={5,2,1,9,0};
        // selectionrec(array,array.length-1,0,0);
        // selectionrecrev(array,array.length,0,0);

        selectionsorting(array);
        System.out.println(Arrays.toString(array));

       
    }
    public static void selectionrecrev( int[] array,int row,int col ,int max){
        if(row==0){
            return;
        }
        if(col<row){
            if(array[col]>array[max]){
                selectionrecrev(array, row, col+1, col);
            }else{
                selectionrecrev(array, row, col+1, max);
            }
        }else{
            int temp=array[max];
             array[max]=array[row-1];
            array[row-1]=temp;
            selectionrecrev(array, row-1, 0, 0);
        }
    }
    public static void selectionrec(int []array,int row,int col, int max){// this is for the reverse order
        if(row==0){
            return ;
        }
        if(col<row){
            if(array[max]>array[col]){
                max=col;
            }
            selectionrec(array, row, col+1, max);
        }else{
            int temp=array[max];
             array[max]=array[row];
             array[row]=temp;
             selectionrec(array, row-1, 0, max);
            
        }
    }
    public static void selectionsorting(int array[]){
        int max=0;
        for (int i = 0; i < array.length; i++) {
            max=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[max]<array[j]){
                    max=j;//here we assing the minimum element index
                }

            }
            int temp=array[max];
            array[max]=array[i];
            array[i]=temp;
        }
    }

}
