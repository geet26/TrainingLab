package training.ideas.java.fibonacciseries;

/**
 * Created by idngeb on 2014-08-08.
 */
public class RecursionWithForLoop {
    public static int[] fib(int number){
        int result[] = new int[number];
        switch (number){
            case 0:
                return result;
            case 1:
                result[0]=0;
                return result;
            default:
                for (int no = 0; no < number; no++) {
                    result[no] = fib_recursion(no);
                }
                return  result;
        }
    }

    private static int fib_recursion(int number) {
        return (number == 0 || number == 1) ? number : fib_recursion(number - 1)+ fib_recursion(number - 2);
    }
}
