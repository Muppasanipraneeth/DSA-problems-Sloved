class equilibrium{
    public static void main(String args[]){
        long array[]={1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int ans=equilibriumpoint(array);
        System.out.println(ans);
    }
    public static int equilibriumpoint( long []array){
        int ans=-1;
        int totalsum=0;
        for (int i = 0; i < array.length; i++) {
            totalsum+=array[i];
        }
        int leftsum=0;
        for (int i = 0; i < array.length; i++) {
            totalsum-=array[i];
            if(totalsum==leftsum){
                return i+1;
            }
            leftsum+=array[i];
        }
    return ans;

    }
}