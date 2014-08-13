package training.ideas.java.sort;

import training.ideas.java.utilities.SortingUtilities;

/**
 * Created by idngeb on 2014-08-05.
 */
public class SelectionSort {
    private static int[] selection_Sort(int[] numbers,SortingOrder user_sort_Order) {
        int pointer;
        for (int pointer_cnt = 0; pointer_cnt < numbers.length-1 ; pointer_cnt++) {
            pointer = pointer_cnt;
            for (int j = pointer +1; j <= numbers.length-1 ; j++) {
                if(SortingUtilities.sort_Condition(user_sort_Order, numbers[pointer], numbers[j])){
                    SortingUtilities.swap_Element(numbers, pointer, j);
                }
           }
        }
        return numbers;
    }

    public static int[] selection_Sort_ASC(final int [] int_Array){
        return selection_Sort(int_Array,SortingOrder.ASCENDING);
    }
    public static int[] selection_Sort_DSC(final int [] int_Array){
        return selection_Sort(int_Array,SortingOrder.DESCENDING);
    }

}
