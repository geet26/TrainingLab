package training.ideas.java.calculator;

/**
 * Created by idngeb on 2014-08-22.
 */
public class TransposeMatrix {
    public static int[][] transpose(int[][] input) {
        int rowCnt = input.length;
        int colCnt = input[0].length;
        int output [] [] = new int[colCnt][rowCnt];
        for (int i = 0; i < colCnt; i++) {
            for (int j = 0; j < rowCnt; j++) {
                output[i][j] = input[j][i];
            }
        }
        return output;
    }
}
