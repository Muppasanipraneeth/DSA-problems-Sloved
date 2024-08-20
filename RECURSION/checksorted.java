public class checksorted {
    // this porgram is about check the array is sorted or not
    public static void main(String[] args) {
     int array[]={1,9,6,8};
     boolean ans=sorted(array,0);  
     System.out.println(ans); 
    }
    public static boolean sorted( int array[],int i){
        if(i==array.length-1){
            return true;
        }
        if(!(array[i]<array[i+1])){
            return false;
        }
        return sorted(array, i+1);
    }
}
