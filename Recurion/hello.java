class hello{
    // in this code we are doing checking the array sorted or not by the recursion
    //searching the array element is present or not

    public static void main (String args[]){
        System.out.println(" hello there after long time");
        int array[]={1,2,4,3,5,6};
        boolean ans=sortedcheck(0,array);
        System.out.println(ans);
        boolean ans1=searching(array,5,0);
        System.out.println(ans1);
        int index=searching1(array,5,0);
        System.out.print(index);
    
    }
    private static int searching1(int[] array, int i, int j) {
       if(j==array.length){
        return -1;
       }
       if(array[j]==i){
        return j;
       }else{
        return searching1(array, i, j+1);
       }
    }
    private static boolean searching(int[] array, int target,int i) {
        if(i==array.length){
            return false;
        }
        return array[i]==target || searching(array, target, i+1);

    }
    public static boolean sortedcheck(int i,int []array){
        if(i==array.length-1){
            return true;
        }
        return array[i]<array[i+1]&& sortedcheck(i+1,array);
    }
}