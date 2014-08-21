package training.ideas.java.stringmanupulations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-17.
 */
public class Index_Test {
    @Test
    public void get_index_as_minus_1_within_an_input_string(){
        String input = "ABCDdefTPEO";
        char search = 'z';
        Assert.assertEquals(-1,Index_String.getIndex(input,search));
    }
    @Test
    public void get_index_within_an_input_string(){
        String input = "ABCDdefTPEO";
        char search = 'D';
        Assert.assertEquals(3,Index_String.getIndex(input,search));
    }
    @Test
    public void get_index_as_minus_1_when_no_search_is_given_within_an_input_string(){
        String input = "ABCDdefTPEO";
        char search =0;
        Assert.assertEquals(-1,Index_String.getIndex(input,search));
    }
    @Test
    public void get_index_as_minus_1_when_no_string_and_search_is_given_within_an_input_string(){
        String input = "";
        char search =0;
        Assert.assertEquals(-1,Index_String.getIndex(input,search));
    }
    @Test
    public void get_index_from_character_location(){
        String input = "SpeedTest.On.SpeedNet";
        char search ='e';
        int index= 5;
        Assert.assertEquals(6,Index_String.getIndex(input,search,index));
    }
    @Test
    public void get_index_from_character_location_as_minus_1(){
        String input = "SpeedTest.On.SpeedNet";
        char search ='z';
        int index= 5;
        Assert.assertEquals(-1,Index_String.getIndex(input,search,index));
    }
    @Test
    public void given_char_array_and_char_and_invalid_index_from_first_get_index_from_first_occurrence() {
        String input = "";
        char search = '9';
        int index = 0;
        Assert.assertEquals(-1,Index_String.getIndex(input,search,index));
    }
    @Test
    public void given_char_array_and_char_and_index_from_first_get_index_from_first_occurrence() {
        String input = "'\'";
        char search = '\'';
        int index = 0;
        Assert.assertEquals(0, Index_String.getIndex(input, search, index));
    }
    @Test
    public void get_count_of_character(){
        String input = "SpeedTest.On.SpeedNet";
        char search ='S';
        Assert.assertEquals(2,Index_String.getCount(input,search));
    }
    @Test
    public void get_count_of_character_as_minus_1(){
        String input = "SpeedTest.On.SpeedNet";
        char search ='Z';
        Assert.assertEquals(0,Index_String.getCount(input,search));
    }
}
