package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;
/**
 * Created by idngeb on 2014-07-21.
 */
public class AdditionTest {

    @Test
    public void given_Two_Integer_Numbers_6_And_10_I_Should_Get_Sum_As_16(){
        Assert.assertEquals("Addition does not match",6+10,Addition.performAddition(6,10),0.0);
    }
    @Test
    public void given_Two_Integer_Numbers_Minus_6_And_Minus_10_I_Should_Get_Sum_As_16(){
        Assert.assertEquals("Addition does not match",-6-10,Addition.performAddition(-6,-10),0.0);
    }
    @Test
    public void given_Integer_Array_I_Should_Get_The_Sum(){
        int[] int_array = {1,2,3,4};
        Assert.assertEquals("Addition does not match", 10, Addition.performAddition(int_array),0.0);
    }
    @Test
    public void given_Any_Numbers_Of_Integers_I_Should_Get_The_Sum(){
        Assert.assertEquals("Addition does not match",14,Addition.performAddition(7, 4, 3),0.0);
    }


    @Test
    public void given_Two_Double_Numbers_Minus_6And_Minus_10_I_Should_Get_Sum_As_16(){
        Assert.assertEquals("Addition does not match",-6.0-10.0,Addition.performAddition(-6.0,-10.0));
    }

    @Test
    public void given_Double_Array_I_Should_Get_The_Sum(){
        double[] array = {-5.3,3.6,6.5,9.6};
        Assert.assertEquals("Addition does not match",14.4,Addition.performAddition(array));
    }
    @Test
    public void given_Any_Numbers_Of_Doubles_I_Should_Get_The_Sum(){
        Assert.assertEquals("Addition does not match",5.0+0.3+3.2-9.6-8.3+11.6+9.0,Addition.performAddition(5,0.3,3.2,-9.6,-8.3,11.6,9.0));
    }
   @Test
    public void given_Any_Numbers_Of_Integers_And_Double_I_Should_Get_Sum_In_Double(){
        Assert.assertEquals("aAddition does not match",10.0+10.0+5+5+10.0+5+5,Addition.performAddition(10.0,10.0,5,5,10.0,5,5));
        Assert.assertEquals("Addition does not match",0.5,Addition.performAddition(-5.5,6));
    }
    @Test
    public void given_Any_Numbers_Of_Integers_And_Double_I_Should_Get_Sum_In_Integer(){
        Assert.assertEquals("aAddition does not match",50,Addition.performAddition(10.0,10.0,5,5,10.0,5,5),0.0);
    }
}
