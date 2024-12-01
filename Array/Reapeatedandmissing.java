package Array;

import java.util.Arrays;

public class Reapeatedandmissing {
    public static void main(String[] args) {
        int grid[][]={{9,1,7},{8,9,2},{3,4,6}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));

    }public  static  int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;

        int freq[]=new int[n*n+1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                freq[grid[i][j]]++;
            }

        }
        System.out.println(Arrays.toString(freq));
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int ans[]=new int[2];
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans[0] = i;
            }
            if(freq[i]<min){
                min = freq[i];
                ans[1] = i;
            }

        }
       return ans;



    }
}
