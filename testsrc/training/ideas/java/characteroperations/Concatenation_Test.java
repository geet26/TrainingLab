package training.ideas.java.characteroperations;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by idngeb on 2014-08-14.
 */
public class Concatenation_Test {
    @Test
    public void given_2_input_char_array_concatenate_it(){
        char[] input1 = {'a','b','c','1','2','1'};
        char[] input2 = {'A','B','C','2','$','&',',',';','"','\'','.'};
        char[] output = {'a','b','c','1','2','1','A','B','C','2','$','&',',',';','"','\'','.'};
        Assert.assertArrayEquals(output,Character_Concatenation.concat(input1,input2));
    }
    @Test
    public void given_2_input_char_array_1_blank_concatenate_it(){
        char[] input1 = {};
        char[] input2 = {'A','B','C'};
        char[] output = {'A','B','C'};
        Assert.assertArrayEquals(output,Character_Concatenation.concat(input1,input2));
    }
    @Test
    public void given_2_input_char_array_2_blank_concatenate_it(){
        char[] input1 = {'a','b','c'};
        char[] input2 = {};
        char[] output = {'a','b','c'};
        Assert.assertArrayEquals(output,Character_Concatenation.concat(input1,input2));
    }
    @Test
    public void given_2_input_char_array_1_and_2_blank_concatenate_it(){
        char[] input1 = {};
        char[] input2 = {};
        char[] output = {};
        Assert.assertArrayEquals(output,Character_Concatenation.concat(input1,input2));
    }
}
