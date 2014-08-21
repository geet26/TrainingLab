package training.ideas.java.stringmanupulations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-17.
 */
public class SubStringTest {
    @Test
    public void given_an_array_find_sub_string_till_index_as_end() {
        String input = "www.ideas.com";
        int index = 3;
        String output = "www.";
        Assert.assertEquals(output, SubString.getString(input, index));
    }
    @Test
    public void given_an_array_find_sub_string_as_first_character_till_index_as_end() {
        String input = "www.ideas.com";
        int index = 0;
        String output = "w";
        Assert.assertEquals(output, SubString.getString(input, index));
    }
    @Test
    public void given_an_array_find_sub_string_as_from_start_end_index_1_till_index_as_end() {
        String input = "www.ideas.com";
        int sindex = 0;
        int eindex = 0;
        String output = "w";
        Assert.assertEquals(output, SubString.getString(input, sindex,eindex));
    }
    @Test
    public void given_an_array_find_sub_string_as_ideas_start_end_index_1_till_index_as_end() {
        String input = "www.ideas.com";
        int sindex = 4;
        int eindex =8;
        String output = "ideas";
        Assert.assertEquals(output, SubString.getString(input, sindex,eindex));
    }
}
