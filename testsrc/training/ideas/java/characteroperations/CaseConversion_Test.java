package training.ideas.java.characteroperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-15.
 */
public class CaseConversion_Test {
    @Test
    public void given_a_char_array_in_uppercase_get_me_lowercase(){
        char [] input = {'A','B','C','a','*','Z'};
        char [] output = {'a','b','c','a','*','z'};
        Assert.assertArrayEquals(output,CaseConversion.convertToLowerCase(input));
    }
    @Test
    public void given_a_char_array_in_lowercasr_get_me_uppercase(){
        char [] input = {'A','B','C','a','1','7','&','~','g','e','e','t','z'};
        char [] output = {'A','B','C','A','1','7','&','~','G','E','E','T','Z'};
        Assert.assertArrayEquals(output,CaseConversion.convertToUpperCase(input));
    }
    @Test
    public void given_a_blank_char_array_in_lowercasr_get_me_uppercase(){
        char [] input = {};
        char [] output = {};
        Assert.assertArrayEquals(output,CaseConversion.convertToUpperCase(input));
    }
}
