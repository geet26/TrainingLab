package training.ideas.java.calculator;

/**
 * Created by idngeb on 2014-08-21.
 */
public class MatrixAddition {
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int rowCnt = getRowCount(matrix1);
        int colCnt = matrix1[0].length;
        int[][] output = new int[getRowCount(matrix1)][matrix1[0].length];
        if(rowCnt > 0 && rowCnt == getRowCount(matrix2) && matrix1[0].length == matrix2[0].length) {
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix1[0].length; j++) {
                        output[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
        }
        return output;
    }
    private static int getRowCount(int [] [] matrix){
        return matrix.length;
    }

}

