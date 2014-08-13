package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-07-28.
 */
public class MINLOS_Test {
    @Test
    public void given_a_FPLOS_Pattern_As_YYYYYYY_I_Should_Get_Minlos_As_1(){
        Assert.assertEquals("MINLOS does not match", 1, Decision.generateMINLOS("YYYYYYY"));
    }
    @Test
    public void given_a_FPLOS_Pattern_As_NNNNNNN_I_Should_Get_Minlos_As_0(){
        Assert.assertEquals("MINLOS does not match",0,Decision.generateMINLOS("NNNNNNN"));
    }
    @Test
    public void given_a_FPLOS_Pattern_As_NNYYYYY_I_Should_Get_Minlos_As_3(){
        Assert.assertEquals("MINLOS does not match",3,Decision.generateMINLOS("NNYYYYY"));
    }
    @Test
    public void given_a_FPLOS_Pattern_As_NNNNNNY_I_Should_Get_Minlos_As_7(){
        Assert.assertEquals("MINLOS does not match",7,Decision.generateMINLOS("NNNNNNY"));
    }
    @Test
    public void given_a_FPLOS_Pattern_As_YNNNNNY_I_Should_Get_Minlos_As_1(){
        Assert.assertEquals("MINLOS does not match",1,Decision.generateMINLOS("YNNNNNY"));
    }
    @Test
    public void given_a_FPLOS_Pattern_As_null_I_Should_Get_Minlos_As_minus1(){
        Assert.assertEquals("MINLOS does not match",-1,Decision.generateMINLOS(""));
    }
}
