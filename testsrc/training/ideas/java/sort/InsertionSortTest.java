package training.ideas.java.sort;
/**
 * Created by idngeb on 2014-07-23.
 */
import org.junit.Test;
import org.junit.Assert;
public class InsertionSortTest {



    @Test
    public void given_a_Set_Of_Already_Sorted_Numbers_I_Should_Get_Same_Set_using_insertionSort(){
        int [] int_Numbers_Input = {200,300,350,400};
        int [] expected_Sorted_Output = {400,350,300,200};
        Assert.assertArrayEquals(expected_Sorted_Output, InsertionSort.insertion_sort_DSC(int_Numbers_Input));
    }

    @Test
    public void given_All_Positive_Numbers_I_Should_Get__Sorted_Output_In_Ascending_Order_using_insertionSort(){
        int [] int_Numbers_Input = {6,900,0,2,5,-9,-11,-9,6,-1};
        int [] expected_Sorted_Output = {-11,-9,-9,-1,0,2,5,6,6,900};
        Assert.assertArrayEquals(expected_Sorted_Output, InsertionSort.insertion_sort_ASC(int_Numbers_Input));
    }

    @Test
    public void given_All_Positive_Numbers_I_Should_Get__Sorted_Output_In_Descending_Order_using_insertionSort(){
        int [] int_Numbers_Input = {2,1,-1,-2,3,9,-9,7,6,-1};
        int [] expected_Sorted_Output = {-9,-2,-1,-1,1,2,3,6,7,9};
        Assert.assertArrayEquals(expected_Sorted_Output, InsertionSort.insertion_sort_ASC(int_Numbers_Input));
    }

    @Test
    public void given_All_Negative_Numbers_I_Should_Get__Sorted_Output_In_Ascending_Order_InsertionSort(){
        int [] int_Numbers_Input = {-9,-2,-11,-1,0,89,};
        int [] expected_Sorted_Output = {-11,-9,-2,-1,0,89};
        Assert.assertArrayEquals(expected_Sorted_Output, InsertionSort.insertion_sort_ASC(int_Numbers_Input));
    }
    @Test
    public void given_All_Positive_Numbers_I_Should_Get__Sorted_Output_In_Ascending_Order_using_InsertionSort(){
         int [] int_Numbers_Input = {5,6,2,9,1,400,350,300,200};
        int [] expected_Sorted_Output = {1,2,5,6,9,200,300,350,400};
        Assert.assertArrayEquals(expected_Sorted_Output, InsertionSort.insertion_sort_ASC(int_Numbers_Input));

        }
    }


