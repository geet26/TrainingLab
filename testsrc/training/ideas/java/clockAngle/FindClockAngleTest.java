package training.ideas.java.clockAngle;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idngeb on 2014-08-12.
 */
public class FindClockAngleTest {
    @Test
    public void angle_should_be_0_when_time_is_12()
    {
        Assert.assertEquals(0.0, ClockAngle.findangle(12, 0));
    }
    @Test
    public void angle_should_be_when_time_is_09hr_55min() {
        Assert.assertEquals(32.5, ClockAngle.findangle(9, 55));

    }
    @Test
    public void angle_should_be_when_time_is_09hr_05min() {
        Assert.assertEquals(117.5, ClockAngle.findangle(9, 05));

    }
    @Test
    public void angle_should_be_140_when_time_is_11min_20min() {
        Assert.assertEquals(140.0, ClockAngle.findangle(11, 20));

    }
    @Test
    public void angle_should_be_180_when_time_is_6() {
        Assert.assertEquals(180.0, ClockAngle.findangle(6, 00));

    }
    @Test
    public void angle_should_be_130_when_time_is_3hr_40min() {
        Assert.assertEquals(130.0, ClockAngle.findangle(3, 40));

    }
    @Test
    public void angle_should_be_7_and_half_when_time_is_8hr_45min() {
        Assert.assertEquals(7.5, ClockAngle.findangle(8, 45));

    }
    @Test
    public void angle_should_be_when_time_is_12hr_23min() {
        Assert.assertEquals(126.5, ClockAngle.findangle(12, 23));

    }
    @Test
    public void angle_should_be_when_time_is_07hr_05min() {
        Assert.assertEquals(77.5, ClockAngle.findangle(9, 35));

    }


}
