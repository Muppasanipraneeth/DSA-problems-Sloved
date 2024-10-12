public class FindPivot {
    public static void main(String[] args) {
        int array[] = {1, 7, 3, 6, 5, 6};
        int ans = findPivot(array);
        System.out.println(ans); 
    }

    public static int findPivot(int[] array) {
        int totalsum=0;
        for (int i : array) {
            totalsum+=i;
        }
        int leftsum=0;
        for (int j = 0; j < array.length; j++) {
            if(leftsum==totalsum- leftsum -array[j]){
                return j;
            }
            leftsum+=array[j];
            
        }

        

        return -1;
    }
}
