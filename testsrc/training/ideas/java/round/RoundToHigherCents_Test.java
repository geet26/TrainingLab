package training.ideas.java.round;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-11.
 */
public class RoundToHigherCents_Test {
    @Test
    public void i_should_get12n20_when_amount_is12n17(){
        Assert.assertEquals(12.20 , RoundUptoToHigherCents.findamount(12.17));
    }
    @Test
    public void i_should_get12n30_when_amount_is12n37(){
        Assert.assertEquals(12.30 , RoundUptoToHigherCents.findamount(12.30));
    }
    @Test
    public void i_should_get12n30_when_amount_is12n30(){
        Assert.assertEquals(12.30 , RoundUptoToHigherCents.findamount(12.30));
    }
    @Test
    public void test2()
    {

        Assert.assertEquals(21.00 , RoundUptoToHigherCents.findamount(20.96));
    }


}
