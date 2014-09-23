package training.ideas.java.decisions;

/**
 * Created by idngeb on 2014-09-23.
 */
public class RateNotAvailableException extends Exception {
    public RateNotAvailableException(String rateCode) {
        super("Rate Code" +  rateCode  + "is not available");
    }
}
