package training.ideas.java.calculator;

/**
 * Created by idngeb on 2014-08-25.
 */
public class MatrixMultiplication {
    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int [][] out = new int[0][0];
        int rowCntM1 = mat1.length;
        int colCntM1 = mat2[0].length;
        if(mat1[0].length == mat2.length) {
             out = new int[rowCntM1][colCntM1];
            for (int row = 0; row < rowCntM1; row++) {
                for (int col = 0; col < colCntM1; col++) {
                    for (int posEle = 0; posEle < mat2.length; posEle++) {
                        out[row][col] += mat1[row][posEle] * mat2[posEle][col];
                    }
                }
            }
        }
        return out;
    }

    public static int[][] multiply_old(int[][] mat1, int[][] mat2) {
        int [][] out = new int[mat1.length][mat1[0].length];
        for (int row = 0; row < mat1[0].length; row++) {
            for (int col = 0; col < mat1.length; col++) {
                for (int posEle = 0; posEle < mat2[0].length; posEle++) {
                    out[row][col] +=  mat1[row][posEle] * mat2[posEle][col];
                }
            }
        }
        return out;
    }
}
