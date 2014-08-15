package training.ideas.java.characteroperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-15.
 */
public class SubstringTest {
    @Test
    public void given_an_array_find_sub_array_till_index_3() {
        char[] input = {'a', 'b', 'n', 'm', 'k', 'c', 's'};
        int index = 3;
        char output[] = {'a', 'b', 'n', 'm'};
        Assert.assertArrayEquals(output,Substring.getstring(input,index));
    }
    @Test
    public void given_an_array_find_sub_array_till_index_as_end() {
        char[] input = {'a', 'b', 'n', 'm', 'k', 'c', 's'};
        int index = 6;
        char output[] = {'a', 'b', 'n', 'm', 'k', 'c', 's'};
        Assert.assertArrayEquals(output,Substring.getstring(input,index));
    }

    @Test
    public void given_an_array_find_sub_array_till_index_0() {
        char[] input = {'a', 'b', 'n', 'm', 'k', 'c', 's'};
        int index = 0;
        char output[] = {'a'};
        Assert.assertArrayEquals(output,Substring.getstring(input,index));
    }
    @Test
    public void given_an_array_find_sub_array_till_index_minus_1() {
        char[] input = {};
        int index = 9;
        char output[] = {};
        Assert.assertArrayEquals(output,Substring.getstring(input,index));
    }
    @Test
    public void given_an_array_find_sub_array_till_invalid_index_minus_1() {
        char[] input = {'a', 'b', 'n', 'm', 'k', 'c', 's'};
        int index = 19;
        char output[] = {};
        Assert.assertArrayEquals(output,Substring.getstring(input,index));
    }
    @Test
    public void given_an_array_start_and_end_index_gind_substring(){
        char[] input = {'a', 'b', 'n', 'm', 'k', 'c', 's'};
        int start_index = 1;
        int end_index = 2;
        char [] output = {'b','n'};
        Assert.assertArrayEquals(output,Substring.getstring(input,start_index,end_index));



    }


}
