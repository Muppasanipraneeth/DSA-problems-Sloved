public class firstoccarence {// this question is about finding the first and last occurance of the element in the array
    public static void main(String[] args) {
        int array[]={1,2,3,5,3,5,9,1};
        int ans=firstocc(array,0,2);
        System.out.println(ans);
        int ans1=lastocc(array,0,3,-1);
        System.out.println(ans1);
    }
    public static int lastocc( int array[],int i, int key,int value ){
        if(i==array.length-1){
            return value;
        }
        if(array[i]==key){
            value=i;
        }
        return lastocc(array, i+1, key,value);
    }
    public static int firstocc( int array[],int i,int key){
        if(i==array.length-1){
            return -1;// -1 mean the key not at all found

        }
        if(array[i]==key){
            return i;
        }
        return firstocc(array,i+1,key);
    }
}
