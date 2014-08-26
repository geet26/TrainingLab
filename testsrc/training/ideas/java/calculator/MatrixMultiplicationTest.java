package training.ideas.java.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-25.
 */
public class MatrixMultiplicationTest {
    @Test
    public void given_two_matrices_multiply_it() {
        int mat1[][] = {{1, 2}, {3, 5}};
        int mat2[][] = {{5, 6}, {7, 8}};
        int output[][] = {{19, 22}, {50, 58}};
        Assert.assertArrayEquals(output,MatrixMultiplication.multiply(mat1,mat2));
    }
    @Test
    public void given_two_matrices_of_uneven_row_num_multiply_it() {
        int mat1[][] = {{1,2,3}, {4, 5,6}};
        int mat2[][] = {{7,8}, {9,10},{11,12}};
        int output[][] = {{58,64},{139,154}};
        Assert.assertArrayEquals(output,MatrixMultiplication.multiply(mat1,mat2));
    }
    @Test
    public void given_two_matrices_of_uneven_row_num_multiply_it1() {
        int mat1[][] = {{1,2}, {4, 5}};
        int mat2[][] = {{1,2,3}, {1,2,3},{1,2,3}};
        int output[][] = {};
        Assert.assertArrayEquals(output,MatrixMultiplication.multiply(mat1,mat2));
    }

}
