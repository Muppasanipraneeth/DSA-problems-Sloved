public class Numberofpairs {
    public static void main(String[] args) {
        int array1[]={2 ,3 ,4, 5};
        int array2[]={1,2,3};
        long ans=numberofpair(array1,array2);
        System.out.println(ans);
    }
    public static long numberofpair( int []array1,int []array2){
        int count=0;
        for( int i=0; i<array1.length; i++){
            for( int j=0; j<array2.length;j++){
                if(power(array1[i],array2[j])>power(array2[j],array1[i])){
                    count++;
                }
            }
        }
        return count;
    }
    public static int power( int n,int i){
        if(i==0){
            return 1;
        }
        return n*power(n, i-1);
    }
}
/*
 * 
 * import java.util.Arrays;

public class Solution {
    public long countPairs(int x[], int y[], int M, int N) {
        // Sort array y[] for binary search usage
        Arrays.sort(y);
        
        // Count of y[] elements that are equal to 0, 1, 2, 3, and 4
        int[] countY = new int[5];
        for (int i = 0; i < N; i++) {
            if (y[i] < 5) {
                countY[y[i]]++;
            }
        }
        
        long count = 0;
        for (int i = 0; i < M; i++) {
            count += countPairsUtil(x[i], y, countY, N);
        }
        
        return count;
    }

    private long countPairsUtil(int x, int[] y, int[] countY, int N) {
        // If x is 0, then no pairs (x^y) > (y^x)
        if (x == 0) return 0;

        // If x is 1, then (x^y) <= (y^x) for all y (except y=0)
        if (x == 1) return countY[0];

        // Find the number of y elements such that x^y > y^x
        int idx = Arrays.binarySearch(y, x);
        if (idx < 0) {
            idx = -(idx + 1);
        } else {
            while (idx < N && y[idx] == x) {
                idx++;
            }
        }
        
        // All elements after y[idx] are such that x^y > y^x
        long count = N - idx;

        // Add pairs for x > 2, as 2^3 > 3^2 and similar cases
        count += countY[0] + countY[1];

        // Special cases for x = 2
        if (x == 2) {
            count -= (countY[3] + countY[4]);
        }

        // Special case for x = 3 and y = 2
        if (x == 3) {
            count += countY[2];
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int x[] = {2, 1, 6};
        int y[] = {1, 5};
        System.out.println(sol.countPairs(x, y, x.length, y.length)); // Expected output: 3
    }
}
 
 */