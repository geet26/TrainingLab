package training.ideas.java.round;

import static java.lang.StrictMath.ceil;
import static java.lang.StrictMath.floor;

/**
 * Created by idngeb on 2014-08-12.
 */
public class RoundUptoToHigherCents {
    public static double findamount(double amount) {
        amount = amount*20;
        amount = Math.ceil(amount);
        amount = amount/20;
        return amount;
    }
}
