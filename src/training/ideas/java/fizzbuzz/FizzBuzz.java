package training.ideas.java.fizzbuzz;

/**
 * Created by idngeb on 2014-08-09.
 */
public class FizzBuzz {
    public static String[] find_Fizz_Buzz_Alternative(int input_no) {
        String str[] = new String[input_no];
        for (int n = 0; n < input_no; n++) {
            //str[n] = (n + 1) % 15 != 0 ? (n + 1) % 5 != 0 ? (n + 1) % 3 != 0 ? (n + 1)+"" : "fizz" : "buzz" : "fizzbuzz";
             str[n] = (n+1) % 15 == 0 ? "fizzbuzz" : (n+1)% 5 == 0 ? "buzz" : (n+1)% 3 == 0 ? "fizz" : (n+1)+"";
        }
        return str;
    }

}
