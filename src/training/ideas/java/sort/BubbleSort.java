package training.ideas.java.sort;


import training.ideas.java.utilities.SortingUtilities;

public  class BubbleSort {
    private static int[] bubble_Sort(final int[] int_Array,  final SortingOrder user_sort_Order) {
        for (int pass_Cnt = 0; pass_Cnt < int_Array.length; pass_Cnt++)
         {
            for (int swap_Cnt = 0; swap_Cnt < int_Array.length-1-pass_Cnt; swap_Cnt++) {

                if(SortingUtilities.sort_Condition(user_sort_Order ,int_Array[swap_Cnt], int_Array[swap_Cnt+1] )) {
                    SortingUtilities.swap_Element(int_Array, swap_Cnt,swap_Cnt+1);
                 }
            }
        }
        return int_Array;
    }

    public static int[] bubble_Sort_ASC(final int [] int_Array){
        return bubble_Sort(int_Array,SortingOrder.ASCENDING);
    }
    public static int[] bubble_Sort_DSC(final int [] int_Array){
        return bubble_Sort(int_Array,SortingOrder.DESCENDING);
    }


}
