package training.ideas.java.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-07-29.
 */
public class BubbleSortTest {

    @Test
    public void given_All_Same_Numbers_I_Should_Get_Output_As_Input_usingBubbleSort(){
        int [] int_Numbers_Input = {1,1,1};
        int [] expected_Sorted_Output = {1,1,1};
        Assert.assertArrayEquals(expected_Sorted_Output, BubbleSort.bubble_Sort_ASC(int_Numbers_Input));

    }
    @Test
    public void given_a_Set_Of_Already_Sorted_Numbers_I_Should_Get_Same_Set_usingBubbleSort(){
        int [] int_Numbers_Input = {200,300,350,400};
        int [] expected_Sorted_Output = {400,350,300,200};
        Assert.assertArrayEquals(expected_Sorted_Output, BubbleSort.bubble_Sort_DSC(int_Numbers_Input));
    }
    @Test
    public void given_All_Positive_Numbers_I_Should_Get__Sorted_Output_In_Ascending_Order_using_BubbleSort(){
       int [] int_Numbers_Input = {5,6,2,9,1,400,350,300,200};
       int [] expected_Sorted_Output = {1,2,5,6,9,200,300,350,400};
       Assert.assertArrayEquals(expected_Sorted_Output, BubbleSort.bubble_Sort_ASC(int_Numbers_Input));
    }

    @Test
    public void given_All_Negative_Numbers_I_Should_Get__Sorted_Output_In_Ascending_Order_BubbleSort(){
        int [] int_Numbers_Input = {-11,-12,-10,-1,-5,-7};
        int [] expected_Sorted_Output = {-12,-11,-10,-7,-5,-1};
        Assert.assertArrayEquals(expected_Sorted_Output, BubbleSort.bubble_Sort_ASC(int_Numbers_Input));

    }

}
