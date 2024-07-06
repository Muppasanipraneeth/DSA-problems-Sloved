import  java.util.*;
public class triangle{// this problem is about the patterns and problems
    public static void main(String[] args) {
        trainglep(4,0);
        /* 
         *****
         ***
         **
         *
         */
        traingleup(4,0);
        /*
         * 
         **
         ***
         ****
         */
    }
    public static void  traingleup( int row, int col){
        if(row==0){
            return ;
        }
        if(col<row){
           
            traingleup(row, col+1);
            System.out.print("*");
        }else{
           
            traingleup(row-1, 0);
            System.out.println();

        }
        
    }
    public static void trainglep( int row, int col){
        if(row==0){
            return ;
        }
        if(col<row){
            System.out.print("*");
            trainglep(row, col+1);
        }else{
            System.out.println();
            trainglep(row-1, 0);

        }
    }
}