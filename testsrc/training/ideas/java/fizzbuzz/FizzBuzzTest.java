package training.ideas.java.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-09.
 */
public class FizzBuzzTest {
    @Test
    public void given_Number_As_6_the_FizzBuzz_Should_Be_As_Below(){
        int input_no = 6;
        String [] Expected_output = {"1","2","fizz","4","buzz","fizz"};
        Assert.assertArrayEquals(Expected_output,FizzBuzz.find_Fizz_Buzz_Alternative(input_no));

    }
    @Test
    public void given_Number_As_15_the_FizzBuzz_Should_Be_As_Below(){
        int input_no = 15;
        String [] Expected_output = {"1","2","fizz","4","buzz","fizz","7","8","fizz","buzz","11","fizz","13","14","fizzbuzz"};
        Assert.assertArrayEquals(Expected_output,FizzBuzz.find_Fizz_Buzz_Alternative(input_no));

    }
    // alternative method
    @Test
    public void given_Number_As_6_the_FizzBuzzAlt_Should_Be_As_Below(){
        int input_no = 20;
        String [] Expected_output = {"1","2","fizz","4","buzz","fizz","7","8","fizz","buzz","11","fizz","13","14","fizzbuzz","16","17","fizz","19","buzz"};
        Assert.assertArrayEquals(Expected_output,FizzBuzz.find_Fizz_Buzz_Alternative(input_no));

    }
    @Test
    public void given_Number_As_15_the_FizzBuzzAlt_Should_Be_As_Below(){
        int input_no = 15;
        String [] Expected_output = {"1","2","fizz","4","buzz","fizz","7","8","fizz","buzz","11","fizz","13","14","fizzbuzz"};
        Assert.assertArrayEquals(Expected_output,FizzBuzz.find_Fizz_Buzz_Alternative(input_no));

    }
    @Test
    public void given_Number_As_blank_the_FizzBuzzAlt_Should_Be_As_Below(){
        int input_no = 0;
        String [] Expected_output = {};
        Assert.assertArrayEquals(Expected_output,FizzBuzz.find_Fizz_Buzz_Alternative(input_no));

    }


}
