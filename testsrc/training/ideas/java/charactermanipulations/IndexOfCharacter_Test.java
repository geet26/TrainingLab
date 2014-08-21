package training.ideas.java.charactermanipulations;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-14.
 */
public class IndexOfCharacter_Test {
    @Test
    public void given_a_character_at_between_getmeindexas0(){
        char [] input = {'a','b','c','a','b','8','*','9'};
        char search = '*';
        Assert.assertEquals(6, Character_Index.getIndex(input, search));
    }
    @Test
    public void given_a_character_at_last_getmeindexas0(){
        char [] input = {'a','b','c','a','b','8','*','9'};
        char serach = '9';
        Assert.assertEquals(7, Character_Index.getIndex(input, serach));
    }
    @Test
     public void given_a_character_at_start_getmeindexas0(){
        char [] input = {'a','a','c','a','b','8','*','9'};
        char serach = 'a';
        Assert.assertEquals(0, Character_Index.getIndex(input, serach));
    }
    @Test
    public void given_a_character_char_not_present_getmeindexas_minus_1(){
        char [] input = {'a','b','c','a','b','8','*','9'};
        char serach = '\'';
        Assert.assertEquals(-1, Character_Index.getIndex(input, serach));
    }
    @Test
    public void given_a_character_empty_arr_not_present_getmeindexas_minus_1(){
        char [] input = {};
        char serach = '\'';
        Assert.assertEquals(-1, Character_Index.getIndex(input, serach));
    }
    @Test
    public void given_a_character_empty_arr_not_ra_and_no_chapresent_getmeindexas_minus_1(){
        char [] input = {};
        char serach = 0;
        Assert.assertEquals(-1, Character_Index.getIndex(input, serach));
    }
    @Test
    public void given_char_array_and_char__invalid_index_get_index_from_first_occurrence(){
        char [] input = {'a' ,'d' , '9' , '8' , 'd','a','d'};
        char search = 'd';
        int index = 11;
        Assert.assertEquals(-1, Character_Index.getIndex(input, search, index));
    }
    @Test
    public void given_char_array_and_char_and_index_get_index_from_first_occurrence(){
        char [] input = {'a' ,'d' , '9' , '8' , 'd','a','d'};
        char search = 'd';
        int index = 1;
        Assert.assertEquals(4, Character_Index.getIndex(input, search, index));
    }
    @Test
    public void given_char_array_and_char_and_index_from_first_get_index_from_first_occurrence(){
        char [] input = {'\'','a' ,'d' , '9' , '8' , 'd','a','d','\''};
        char search = '\'';
        int index = 0;
        Assert.assertEquals(8, Character_Index.getIndex(input, search, index));
    }
    @Test
    public void given_char_array_and_char_and_invalid_index_from_first_get_index_from_first_occurrence(){
        char [] input = {};
        char search = '9';
        int index = 0;
        Assert.assertEquals(-1, Character_Index.getIndex(input, search, index));
    }
}
