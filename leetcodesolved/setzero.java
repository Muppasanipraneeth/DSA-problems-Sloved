import java.lang.reflect.Array;
import java.util.ArrayList;

public class setzero {
    // 73. Set Matrix Zeroes
    public static void main(String[] args) {
        int Matrix[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        ArrayList<ArrayList<Integer>> p = new ArrayList<>();
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                ArrayList<Integer> k = new ArrayList<>();
                if (Matrix[i][j] == 0) {
                    k.add(i);
                    k.add(j);

                }
                if (!k.isEmpty()) {
                    p.add(k);

                }
            }
        }
        reset(Matrix, p);
        print(Matrix);
        // System.out.println(p);
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void reset(int[][] matrix, ArrayList<ArrayList<Integer>> p) {
        for (int i = 0; i < p.size(); i++) {

            change(p.get(i).get(0), p.get(i).get(1), matrix);
        }
    }

    private static void change(Integer row, Integer col, int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
