public class rotatematrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;
        int col=0;
        int row=matrix.length-1;
        int ans[][]=new int[n][n];

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(matrix[row][j]+" ");
                ans[j][col]=matrix[row][j];
            }
            System.out.println();
            col++;
            row--;
        }
        printmatrix(ans);
    }

    private static void printmatrix(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] +" ");
            }
            System.out.println();
        }
    }
}
/*this is another solution
 * class Solution {
    public void rotate(int[][] matrix) {
       for(int row=0;row<matrix.length;row++){
        for(int col=row+1;col<matrix[0].length;col++){
            if(row<col){
                int temp=matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
             }
            }
       }    
        for(int k=0;k<matrix.length;k++){
            int left=0,right=matrix.length-1;
            while(left<right){
                int temp=matrix[k][left];
                matrix[k][left]=matrix[k][right];
                matrix[k][right]=temp;
                left++;
                right--;
            }
        }      
    }
}
 */
