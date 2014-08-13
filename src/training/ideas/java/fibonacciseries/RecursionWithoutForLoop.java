package training.ideas.java.fibonacciseries;

/**
 * Created by idngeb on 2014-08-08.
 */
public class RecursionWithoutForLoop {
    public static int[] fib_arr(int number){
        int array[] = new int[number];
        fib_series(array, number);
        return array;
    }

    private static void fib_series(int arrayElement[], int number) {
            if(number==0) {
            }
            else if(number == 1){
                arrayElement[0] =0;
            }
            else if(number == 2){
                arrayElement[1] = 1;
            }
            else{

                fib_series(arrayElement, number - 1);
                arrayElement[number-1] = arrayElement[number-2]+ arrayElement[number-3];

        }

    }
}
