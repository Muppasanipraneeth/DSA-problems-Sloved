public class sorted {// this question is about check whether the given array is sorted or not 
    public static void main(String args[]){
        int array[]={1,4,21,8,9,18};
        boolean ans=checksorted(array,0);
        System.out.print(ans);
    }public static boolean checksorted(int array[],int i){
        if(array.length-1==i){
            return true;
        }
        if(!(array[i]<array[i+1])){
            return false;
        }
        return checksorted(array,i+1);
    }
}
