package training.ideas.java.fibonacciseries;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-08.
 */
public class Fibonacchi_Test {
    @Test
    public void given_number_as_0_I_Should_get_Fibonacci_Series_as_0(){
        int input = 0;
        int [] expected_Fib_Series={};
        Assert.assertArrayEquals(expected_Fib_Series, Fibonacchi.calculateFibSeries(input));
    }
    @Test
    public void given_number_as_1_I_Should_get_Fibonacci_Series_as_1(){
        int input = 1;
        int [] expected_Fib_Series={0};
        Assert.assertArrayEquals(expected_Fib_Series,Fibonacchi.calculateFibSeries(input));

    }
    @Test
    public void given_number_as_2_I_Should_get_Fibonacci_Series_as_expected(){
        int input = 3;
        int [] expected_Fib_Series={0,1,1};
        Assert.assertArrayEquals(expected_Fib_Series,Fibonacchi.calculateFibSeries(input));
    }
    @Test
    public void given_number_as_11_I_Should_get_Fibonacci_Series_as_expected(){
        int input = 11;
        int [] expected_Fib_Series={0,1,1,2,3,5,8,13,21,34,55};
        Assert.assertArrayEquals(expected_Fib_Series,Fibonacchi.calculateFibSeries(input));
    }
}
