package training.ideas.java.charactermanipulations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-17.
 */
public class IndexOfArrayinArrayTest {
    @Test
    public void findIndexOfArray_when_search_array_in_between(){
        char []  input= {'a','f','c','d','d','f','c'};
        char [] serach_arr = {'d','f','c'};
        Assert.assertEquals(4,IndexOfArray.findArrayIndex(input,serach_arr));
    }
    @Test
    public void findIndexOfArray_when_sub_array_is_at_first(){
        char []  input= {'d','f','c','d','d','f','c','d'};
        char [] serach_arr = {'d','f','c'};
        Assert.assertEquals(0,IndexOfArray.findArrayIndex(input,serach_arr));
    }
    @Test
    public void findIndexOfArray_when_sub_array_is_at_last(){
        char []  input= {'d','f','c','d','d','f','c','x'};
        char [] serach_arr = {'x'};
        Assert.assertEquals(7,IndexOfArray.findArrayIndex(input,serach_arr));
    }
    @Test
    public void findIndexOfArray_when_array_in_between(){
        char []  input= {'d','d','f','f','d','c','d','f','f','c'};
        char [] serach_arr = {'f','f','c'};
        Assert.assertEquals(7,IndexOfArray.findArrayIndex(input,serach_arr));
    }
    @Test
    public void findIndexOfArray_when_array_is_empty(){
        char []  input= {'d','d','f','f','d','c','d','f','f','c'};
        char [] serach_arr = {};
        Assert.assertEquals(-1,IndexOfArray.findArrayIndex(input,serach_arr));
    }
    @Test
    public void findIndexOfArray_when_main_array_is_empty(){
        char []  input= {};
        char [] serach_arr = {'c','d'};
        Assert.assertEquals(-1,IndexOfArray.findArrayIndex(input,serach_arr));
    }
    @Test
    public void findIndexOfArray_when_main_array_has_less_length(){
        char []  input= {'1','2','z','p','f'};
        char [] serach_arr = {'1','2','z','p','f','p','w','t','g'};
        Assert.assertEquals(-1,IndexOfArray.findArrayIndex(input,serach_arr));
    }
    /*given_array_index tests*/
    @Test
    public void findIndexOfArray_when_search_array_in_between_and_given_index(){
        char []  input= {'a','f','c','d','d','f','c','d','f','c'};
        char [] serach_arr = {'d','f','c'};
        int index = 5;
        Assert.assertEquals(7,IndexOfArray.findArrayIndex(input,serach_arr,index));
    }
    @Test
    public void findIndexOfArray_when_search_array_in_between_and_given_index_at_start(){
        char []  input= {'d','f','c','d','d','f','c','d','f','c'};
        char [] serach_arr = {'d','f','c'};
        int index = 0;
        Assert.assertEquals(0,IndexOfArray.findArrayIndex(input,serach_arr,index));
    }
    @Test
    public void findIndexOfArray_when_search_array_in_between_and_given__invalid_index(){
        char []  input= {'d','f','c','d','d','f','c','d','f','c'};
        char [] serach_arr = {'d','f','c'};
        int index = 8;
        Assert.assertEquals(-1,IndexOfArray.findArrayIndex(input,serach_arr,index));
    }
    @Test
    public void findIndexOfArray_when_search_array_in_between_and_given_index_and_empty_array(){
        char []  input= {'d','f','c','d','d','f','c','d','f','c'};
        char [] serach_arr = {};
        int index = 8;
        Assert.assertEquals(-1,IndexOfArray.findArrayIndex(input,serach_arr,index));
    }


}
