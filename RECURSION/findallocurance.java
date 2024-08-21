public class findallocurance{
    public static void main(String args[]){
        // this question is about the finding all the ocurance of the key in the given array 
        int array[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        findallOcurance(array,0,key);
    }
    public static void findallOcurance( int array[],int ind,int key){
        if(ind==array.length){
            return ;
        }
        if(array[ind]==key){
        System.out.println(ind);
        }
        findallOcurance(array,ind+1,key);
        
    }
}