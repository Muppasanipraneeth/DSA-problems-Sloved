public class subsetarra {
    public static void main (String args[]){
        int array[]={1,2,3};
        sub(array,0);
    }
    public static void sub(int []array,int i){
        if(i==array.length){
            System.out.println();
            return ;
        }
        System.out.print(array[i]);
        sub(array,i+1);
    }
}
