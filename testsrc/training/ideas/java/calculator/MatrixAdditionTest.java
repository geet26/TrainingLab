package training.ideas.java.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-21.
 */
public class MatrixAdditionTest {
    @Test
    public void given_2_matrix_of_2_into_2_add_it() {
        int[][] matrix1 = {{1, 2}, {1, 2}};
        int[][] matrix2 = {{1, 2}, {1, 2}};
        int[][] output = {{2, 4}, {2, 4}};
        Assert.assertArrayEquals(output,MatrixAddition.add(matrix1,matrix2));
    }
    @Test
    public void given_2_matrix_of_4_into_3_add_it() {
        int[][] matrix1 = {{1, 2,3}, {5, 2,8},{-1,-5,-9},{0,5,9}};
        int[][] matrix2 = {{1, 2,8}, {-1, -9,-5},{-8,5,-9},{0,0,0}};
        int[][] output = {{2, 4,11}, {4,-7,3},{-9,0,-18},{0,5,9}};
        Assert.assertArrayEquals(output,MatrixAddition.add(matrix1,matrix2));
    }
    @Test
    public void given_2_matrix_of_4_into_3_and_2_into_0_add_it() {
        int[][] matrix1 = {{1, 2,3}, {5, 2,8},{-1,-5,-9},{0,5,9}};
        int[][] matrix2 = {{1}, {-1}};
        int[][] output = {};
        Assert.assertArrayEquals(output,MatrixAddition.add(matrix1,matrix2));
    }


}
