package training.ideas.java.decisions;
import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by idngeb on 2014-09-09.
 */
public class FPLOS_Test {
    DateFormat df = new SimpleDateFormat("yyyy-MMM-dd");
    FPLOS fplos_primitive = new FPLOS();
    @Test
    public void rate_has_open_close_pattern_for_given_rate_and_LRV(){
        double rate = 90.00;
        double [] lrv = {98.2, 117, 0, 100, 37, 1, 88};
        Assert.assertEquals("FPLOS  is not as expected", "NNYYYYY", fplos_primitive.generateFPLOSPattern(lrv, rate));
    }
    @Test
    public void rate_is_closed_as_LRV_is_higher_than_rate(){
        double rate = 0d;
        double [] lrv = {1.0,2.0,3.0,4.0,5.0,6.0,7.0};
        Assert.assertEquals("FPLOS is not as expected", "NNNNNNN", fplos_primitive.generateFPLOSPattern(lrv, rate));
    }
    @Test
    public void rate_is_open_as_rate_is_higher_than_LRV()
    {
        double rate = 50d;
        double [] lrv = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        Assert.assertEquals("FPLOS Pattern does not match", "YYYYYYY", fplos_primitive.generateFPLOSPattern(lrv, rate));
    }
    @Test
    public void all_rates_in_a_spectrum_are_close(){
        double[] rateSpectrum = {0.0,0.0,0.0,0.0};
        double[] lrv = {1.0,2.3,5.0,4.0,6.0,8.0,3.0};
        String [] expected_FPLOS_Pattern = {"NNNNNNN","NNNNNNN","NNNNNNN","NNNNNNN"};
        Assert.assertArrayEquals("FPLOS Pattern does not match", expected_FPLOS_Pattern, fplos_primitive.generateFPLOSPattern(lrv, rateSpectrum));
    }
    @Test
    public void all_rates_in_a_spectrum_are_open_as_LRV_is_lower(){
        double[] rateSpectrum = {10.0,11.0,121.3,200.0,125.65};
        double[] lrv = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        String [] expected_FPLOS_Pattern = {"YYYYYYY","YYYYYYY","YYYYYYY","YYYYYYY","YYYYYYY"};
        Assert.assertArrayEquals("FPLOS Pattern does not match", expected_FPLOS_Pattern, fplos_primitive.generateFPLOSPattern(lrv, rateSpectrum));
    }
    @Test
    public void all_rates_in_a_spectrum_are_open(){
        double[] rateSpectrum = {0.0,0.0};
        double[] lrv = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        String [] expected_FPLOS_Pattern = {"YYYYYYY","YYYYYYY"};
        Assert.assertArrayEquals(expected_FPLOS_Pattern, fplos_primitive.generateFPLOSPattern(lrv, rateSpectrum));

           }
    @Test
    public void rates_in_spectrum_have_different_FPLOS(){
        double[] rateSpectrum = {50.00,510.00,1.00,1.00,287.00,100.00};
        double[] lrv = {9.26,371.87,0.01,0.00,36.62,0.00,0.00};
        String [] expected_FPLOS_Pattern = {"YNNNNNN","YYYYYYY","NNNNNNN","NNNNNNN","YYYYYYY","YNNYYYY"};
        Assert.assertArrayEquals("FPLOS Pattern does not match", expected_FPLOS_Pattern, fplos_primitive.generateFPLOSPattern(lrv, rateSpectrum));
    }

    @Test
    public void test_getFPLOS() throws ParseException, RateNotAvailableException {

        List<Rate> input_rateSpectrum = new ArrayList<Rate>();
        input_rateSpectrum.add(new Rate("RACK", Arrays.asList(new Season(df.parse("2014-Jan-01"), df.parse("2014-Jan-15"), 00.00), new Season(df.parse("2014-Jan-16"), df.parse("2014-Jan-25"), 90.00))));
        input_rateSpectrum.add(new Rate("LV0", Arrays.asList(new Season(df.parse("2014-Jan-01"), df.parse("2014-Jan-15"), 00.00), new Season(df.parse("2014-Jan-16"), df.parse("2014-Jan-25"), 0.00))));
        FPLOS fplos = new FPLOS(input_rateSpectrum);

        Map<Date,List<Double>> input_date_wiseLRV = new TreeMap<Date, List<Double>>();
        input_date_wiseLRV.put(df.parse("2014-Jan-01"), Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0));
        input_date_wiseLRV.put(df.parse("2014-Jan-22"), Arrays.asList(98.2, 117.0, 0.0, 100.0, 37.0, 1.0, 88.0));

        Map<Date,Map<String, String>> expected_Decisions = new TreeMap<Date, Map<String, String>>();
        Map<String,String> rate_fplos = new TreeMap<String, String>();
        rate_fplos.put("RACK", "NNNNNNN");
        rate_fplos.put("LV0","NNNNNNN");
        expected_Decisions.put(df.parse("2014-Jan-01"), rate_fplos);

        rate_fplos = new TreeMap<String, String>();
        rate_fplos.put("RACK","NNYYYYY");
        rate_fplos.put("LV0","NNNNNNN");
        expected_Decisions.put(df.parse("2014-Jan-22"), rate_fplos);


        Assert.assertEquals(expected_Decisions, fplos.generateFPLOSPattern(input_date_wiseLRV));


    }

}
