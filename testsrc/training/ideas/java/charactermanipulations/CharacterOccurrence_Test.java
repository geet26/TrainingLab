package training.ideas.java.charactermanipulations;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-16.
 */
public class CharacterOccurrence_Test {
    @Test
    public void get_occurrence_of_2() {
        char[] input = {'a', 'v', 'm', 't', '2', '1', '8', '@', '~', '2', '4', '2'};
        char search = '2';
        Assert.assertEquals(3, Character_Index.getOccurrence(input, search));
    }
    @Test
    public void get_occurrence_of_2_2_at_first_and_last_in_array() {
        char[] input = {'2','a', 'v', 'm', 't', '7', '1', '8', '@', '~', '8', '4', '2'};
        char search = '2';
        Assert.assertEquals(2, Character_Index.getOccurrence(input, search));
    }
    @Test
    public void get_occurrence_of_x() {
        char[] input = {'a', 'v', 'm', 't', '2', '1', '8', '@', '~', '2', '4', '2'};
        char search = 'x';
        Assert.assertEquals(-1, Character_Index.getOccurrence(input, search));
    }
    @Test
    public void get_occurrence_of_2_in_empty_array() {
        char[] input = {};
        char search = '2';
        Assert.assertEquals(-1, Character_Index.getOccurrence(input, search));
    }
}
