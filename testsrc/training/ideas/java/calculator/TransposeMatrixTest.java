package training.ideas.java.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-22.
 */
public class TransposeMatrixTest {
    @Test
     public void given_a_matrix_transpose_it(){
        int [] [] input = {{1,2,3},{5,6,9}};
        int [] [] output={{1,5},{2,6},{3,9}};
        Assert.assertArrayEquals(output,TransposeMatrix.transpose(input));
    }
}
