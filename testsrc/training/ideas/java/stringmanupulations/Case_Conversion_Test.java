package training.ideas.java.stringmanupulations;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-17.
 */
public class Case_Conversion_Test {
    @Test
    public void convert_to_lowercase(){
        String input = "XYZ123abcdFRT123~!@#'";
        String output = "xyz123abcdfrt123~!@#'";
        Assert.assertEquals(output,StringCaseConversion.convert_To_Lowercase(input));
    }
    @Test
    public void convert_to_uppercase(){
        String input = "xyzABC";
        String output = "XYZABC";
        Assert.assertEquals(output,StringCaseConversion.convert_To_Uppercase(input));
    }
}
