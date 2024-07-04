class binarysearch{// this question is about the binary search using the recusion 
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6};
        int ans=search(array,0,array.length,4);
        System.out.println(ans);
    }
    public static int search(int []array, int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(array[mid]==target){
            return mid;
        }else if(array[mid]<target){
            return search(array,mid+1,end,target);
        }else{
            return search(array,start,mid-1,target);
        }
    }
}