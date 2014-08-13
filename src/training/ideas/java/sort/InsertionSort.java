package training.ideas.java.sort;

import training.ideas.java.utilities.SortingUtilities;

/**
 * Created by idngeb on 2014-08-05.
 */
public class InsertionSort {
    public static int [] insertion_sort(int[] numbers,SortingOrder userSortOrder){
        for (int element = 1; element < numbers.length ; element++)
        {
            int value_Partition = numbers[element];
            int swap;
            for (swap = element -1; swap >= 0; swap--) {
                if(SortingUtilities.sort_Condition(userSortOrder, numbers[swap], value_Partition)){
                    numbers[swap + 1] = numbers[swap];
                }
                else{
                    break;
                }

            }
            numbers[swap + 1] = value_Partition;
        }
        return numbers;
    }
    public static int[] insertion_sort_ASC(final int [] int_Array){
        return insertion_sort(int_Array,SortingOrder.ASCENDING);
    }
    public static int[] insertion_sort_DSC(final int [] int_Array){
        return insertion_sort(int_Array,SortingOrder.DESCENDING);
    }

}
