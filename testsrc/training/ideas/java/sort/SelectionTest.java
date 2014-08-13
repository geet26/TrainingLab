package training.ideas.java.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-07-29.
 */
public class SelectionTest {
    @Test
    public void sort_given_a_array_of_mix_positive_negative_numbers1(){
        int [] numbers = {23,78,45,8,7,56};
        int [] output = {78,56,45,23,8,7};
        Assert.assertArrayEquals(output, SelectionSort.selection_Sort_DSC(numbers));
    }
    @Test
    public void sort_given_a_array_of_mix_positive_negative_numbers(){
        int [] numbers = {-66,0,-9,2,1,2,3,4,-5,-2,-7};
        int [] output = {-66,-9,-7,-5,-2,0,1,2,2,3,4};
        Assert.assertArrayEquals(output, SelectionSort.selection_Sort_ASC(numbers));
    }

    @Test
    public void sort_given_a_array_of_mix_positive_negative_numbers2(){
        int [] numbers = {5,1,12,-5,16,2,12,14};
        int [] output =  {-5,1,2,5,12,12,14,16};
        Assert.assertArrayEquals(output, SelectionSort.selection_Sort_ASC(numbers));
    }
    @Test
    public void sort_even_If_sorted_already(){
        int [] numbers = {1,2,3};
        int [] output = {3,2,1};
        Assert.assertArrayEquals(output, SelectionSort.selection_Sort_DSC(numbers));
    }
    @Test
    public void given_All_Same_Numbers_I_Should_Get_Output_As_Input_usingBubbleSort(){
        int [] numbers = {1,1,1};
        int [] output = {1,1,1};
        Assert.assertArrayEquals(output, SelectionSort.selection_Sort_ASC(numbers));
    }
    @Test
    public void given_a_Set_Of_Already_Sorted_Numbers_I_Should_Get_Same_Set_usingBubbleSort(){
        int [] numbers = {200,300,350,400};
        int [] output = {200,300,350,400};
        Assert.assertArrayEquals(output, SelectionSort.selection_Sort_ASC(numbers));
    }
    @Test
    public void given_All_Positive_Numbers_I_Should_Get__Sorted_Output_In_Ascending_Order_using_BubbleSort(){
        int [] numbers = {5,6,2,9,1,200,300,350,400,-2,-11,-1};
        int [] output = {-11,-2,-1,1,2,5,6,9,200,300,350,400};
        Assert.assertArrayEquals(output, SelectionSort.selection_Sort_ASC(numbers));

    }
    @Test
    public void given_All_Negative_Numbers_I_Should_Get__Sorted_Output_In_Ascending_Order_BubbleSort(){
        int [] numbers = {-11,-12,-10,-1,-5,-7};
        int [] output = {-12,-11,-10,-7,-5,-1};
        Assert.assertArrayEquals(output, SelectionSort.selection_Sort_ASC(numbers));
    }

}
