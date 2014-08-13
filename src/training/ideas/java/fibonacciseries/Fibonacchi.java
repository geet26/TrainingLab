package training.ideas.java.fibonacciseries;

/**
 * Created by idngeb on 2014-08-06.
 */
public class Fibonacchi {
    public static int[] calculateFibSeries(int number) {
        int series_Element;
        int fib_series[] = new int[number] ;
        switch (number){
            case 0:
                return fib_series;
            case 1:
                fib_series[0] = 0;
                return fib_series;
            default:
                fib_series[0]=0;
                fib_series[1]=1;
                for (series_Element = 2; series_Element <number ; series_Element++) {
                    fib_series[series_Element] = fib_series[series_Element -1]+ fib_series[series_Element -2];
                }
                return fib_series;
        }

    }




}
