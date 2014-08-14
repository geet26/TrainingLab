package training.ideas.java.stringoperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-13.
 */
public class StringCombinationsTest {
    @Test
    public void given_input_asXYZ_I_should_get_expected_output(){
        String input = "XYZ";
        String [] Expected_output = {"XYZ","YZX","ZXY"};
        Assert.assertArrayEquals(Expected_output, StringCombinations.find(input));
    }
    @Test
    public void given_input_asXYZXYZ_I_should_get_expected_output(){
        String input = "XYZXYZ";
        String [] Expected_output = {"XYZXYZ","YZXYZX","ZXYZXY","XYZXYZ","YZXYZX","ZXYZXY"};
        Assert.assertArrayEquals(Expected_output, StringCombinations.find(input));
    }
    @Test
    public void given_input_asAB_I_should_get_expected_output(){
        String input = "AB";
        String [] Expected_output = {"AB","BA"};
        Assert.assertArrayEquals(Expected_output, StringCombinations.find(input));
    }
    @Test
    public void given_input_as_blank_I_should_get_expected_output(){
        String input = "";
        String [] Expected_output = {};
        Assert.assertArrayEquals(Expected_output, StringCombinations.find(input));
    }
}
