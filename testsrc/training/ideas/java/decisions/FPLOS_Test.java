package training.ideas.java.decisions;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by idngeb on 2014-07-23.
 */
public class FPLOS_Test {
    @Test
    public void given_RateValue_In_Between_LRV_Values_I_Should_Get_FPLOS_As_Of_Y_And_N(){
        double rate = 90.00;
        double [] lrv = {98.2, 117, 0, 100, 37, 1, 88};
         Assert.assertEquals("FPLOS  is not as expected","NNYYYYY", Decision.generateFPLOSPattern(lrv,rate));
    }
    @Test
    public void given_Rate_As_0_And_LRV_Greater_Than_0_i_Should_Get_FPLOS_AS_NNNNNNN(){
        double rate = 0d;
        double [] lrv = {1.0,2.0,3.0,4.0,5.0,6.0,7.0};
        Assert.assertEquals("FPLOS is not as expected","NNNNNNN",Decision.generateFPLOSPattern(lrv,rate));
    }
    @Test
    public void give_Rate_Greater_Than_0_And_LRV_As_0_I_Should_Get_FPLOS_AS_YYYYYYY()
    {
        double rate = 50d;
        double [] lrv = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        Assert.assertEquals("FPLOS Pattern does not match","YYYYYYY",Decision.generateFPLOSPattern(lrv,rate));
    }
    @Test
    public void given_Rate_Spectrum_As_0_And_LRV_As_0_I_Should_Get_FPLOS(){
        double[] rateSpectrum = {0.0,0.0};
        double[] lrv = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        String [] expected_FPLOS_Pattern = {"YYYYYYY","YYYYYYY"};
        Assert.assertArrayEquals(expected_FPLOS_Pattern,Decision.generateFPLOSPattern(lrv,rateSpectrum));
    }
    @Test
    public void given_Rate_Spectrum_As_0_And_LRV_Greater_Than_0_I_Should_Get_FPLOS_As_expected(){
        double[] rateSpectrum = {0.0,0.0,0.0,0.0};
        double[] lrv = {1.0,2.3,5.0,4.0,6.0,8.0,3.0};
        String [] expected_FPLOS_Pattern = {"NNNNNNN","NNNNNNN","NNNNNNN","NNNNNNN"};
        Assert.assertArrayEquals("FPLOS Pattern does not match",expected_FPLOS_Pattern,Decision.generateFPLOSPattern(lrv,rateSpectrum));
    }
    @Test
    public void given_Rate_Spectrum_Greater_Than_0_And_LRV_As_0_I_Should_Get_FPLOS_As_Expected(){
        double[] rateSpectrum = {10.0,11.0,121.3,200.0,125.65};
        double[] lrv = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        String [] expected_FPLOS_Pattern = {"YYYYYYY","YYYYYYY","YYYYYYY","YYYYYYY","YYYYYYY"};
        Assert.assertArrayEquals("FPLOS Pattern does not match",expected_FPLOS_Pattern,Decision.generateFPLOSPattern(lrv,rateSpectrum));
    }
    @Test
    public void given_Rate_Spectrum_And_LRV_I_Should_Get_FPLOS_As_Expected(){
        double[] rateSpectrum = {390.00,450.0};
        double[] lrv = {10.70,0.0,0.0,0.0,1278.54,1359.42,0.01};
        String [] expected_FPLOS_Pattern = {"YYYYYNY","YYYYYYY"};
        Assert.assertArrayEquals("FPLOS Pattern does not match",expected_FPLOS_Pattern,Decision.generateFPLOSPattern(lrv,rateSpectrum));
    }
    @Test
    public void given_Rate_Spectrum_And_LRV_I_Should_Get_FPLOS_For_Rate_Spectrum(){
        double[] rateSpectrum = {50.00,510.00,1.00,1.00,287.00,100.00};
        double[] lrv = {9.26,371.87,0.01,0.00,36.62,0.00,0.00};
        String [] expected_FPLOS_Pattern = {"YNNNNNN","YYYYYYY","NNNNNNN","NNNNNNN","YYYYYYY","YNNYYYY"};
        Assert.assertArrayEquals("FPLOS Pattern does not match",expected_FPLOS_Pattern,Decision.generateFPLOSPattern(lrv,rateSpectrum));
    }


}
