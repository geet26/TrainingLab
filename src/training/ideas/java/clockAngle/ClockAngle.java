package training.ideas.java.clockAngle;

import static java.lang.Math.abs;

/**
 * Created by idngeb on 2014-08-12.
 */
public class ClockAngle {
    public static double findangle(final int hr, final int min) {
        double  dmin , minute,hour,extra_time;
        minute = min*6;
        hour = (hr == 12) ? 0 : hr*30;
        dmin=(double) min;
        extra_time =(dmin/60)*30;
        double angle = abs(minute-(hour+ extra_time));
        return (angle < 180 ) ? angle : 360-angle;
    }
}
