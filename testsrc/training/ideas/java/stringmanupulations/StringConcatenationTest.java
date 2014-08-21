package training.ideas.java.stringmanupulations;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-17.
 */
public class StringConcatenationTest {
    @Test
    public void concatenate_2_strings_when_one_is_blank(){
        String first = "";
        String second = "ABC";
        Assert.assertEquals("ABC",StringConcatenation.concatenate(first,second));

    }
    @Test
    public void concatenate_2_strings(){
        String first = "123cbr";
        String second = "ABC";
        Assert.assertEquals("123cbrABC",StringConcatenation.concatenate(first,second));

    }
}
