package training.ideas.java.utilities;

import training.ideas.java.sort.SortingOrder;

/**
 * Created by idngeb on 2014-08-07.
 */
public class SortingUtilities {
    public static boolean sort_Condition(final SortingOrder user_sort_Order ,final int lhs_Val,int rhs_Val) {

        return (user_sort_Order==SortingOrder.ASCENDING)? lhs_Val > rhs_Val : lhs_Val < rhs_Val;
    }
    public static void swap_Element(int[] int_Array, int no1,int no2) {
        int temp = int_Array[no1];
        int_Array[no1] = int_Array[no2];
        int_Array[no2] = temp;
    }
}
