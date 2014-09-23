package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by idngeb on 2014-07-28.
 */
public class MINLOS_Test {
    DateFormat df = new SimpleDateFormat("yyyy-MMM-dd");
    MINLOS minlos = new MINLOS();
    @Test
    public void minlos_is_1_when_rate_is_open_for_all_los() {
        Assert.assertEquals("MINLOS does not match", 1, minlos.generateMINLOS("YYYYYYY"));

    }
    @Test
    public void minlos_is_0_when_rate_is_close(){
        Assert.assertEquals("MINLOS does not match",0,minlos.generateMINLOS("NNNNNNN"));
    }
    @Test
    public void minlos_is_3_when_rate_is_open_from_third_los(){
        Assert.assertEquals("MINLOS does not match",3,minlos.generateMINLOS("NNYYYYY"));
    }
    @Test
    public void minlos_is_7_when_rate_is_open_from_seventh_los(){
        Assert.assertEquals("MINLOS does not match",7,minlos.generateMINLOS("NNNNNNY"));
    }
    @Test
    public void minlos_is_3_when_rate_is_open_from_first_los(){
        Assert.assertEquals("MINLOS does not match",1,minlos.generateMINLOS("YNNNNNY"));
    }
    @Test
    public void minlos_is_minus_1_rate_is_not_available(){
        Assert.assertEquals("MINLOS does not match",-1,minlos.generateMINLOS(""));
    }
    @Test
    public void minlos_is_different_for_diferent_rates(){
        Map<String, String> input_rateFPLOSMap = new TreeMap<String, String>();
        input_rateFPLOSMap.put("RACK", "YYYYYYY");
        input_rateFPLOSMap.put("LV0", "NNNNNNN");

        Map<String,Integer> expected_rateMINLOS = new TreeMap<String, Integer>();
        expected_rateMINLOS.put("RACK",1);
        expected_rateMINLOS.put("LV0",0);
        org.junit.Assert.assertEquals(expected_rateMINLOS,minlos.generateMINLOS(input_rateFPLOSMap));

    }
    @Test
    public void minlos_is_different_for_different_rates_and_dates() throws ParseException {
        Map<Date,Map<String, String>> inputDateRateMap = new TreeMap<Date, Map<String, String>>();
        Map<String,String> rate_fplos = new TreeMap<String, String>();
        rate_fplos.put("RACK", "NYYYYYY");
        rate_fplos.put("LV0", "YYYYYYY");
        inputDateRateMap.put(df.parse("2014-Sep-15"), rate_fplos);

        rate_fplos = new TreeMap<String, String>();
        rate_fplos.put("RACK","NNNNNNY");
        rate_fplos.put("LV0", "NNNNNNN");
        inputDateRateMap.put(df.parse("2014-Sep-25"), rate_fplos);


        Map<Date,Map<String,Integer>> expectedDateMinLOS = new TreeMap<Date, Map<String, Integer>>();
        Map<String,Integer> rateMINLOSMap = new TreeMap<String, Integer>();
        rateMINLOSMap.put("RACK", 2);
        rateMINLOSMap.put("LV0", 1);
        expectedDateMinLOS.put(df.parse("2014-Sep-15"),rateMINLOSMap);

        rateMINLOSMap = new TreeMap<String, Integer>();
        rateMINLOSMap.put("RACK", 7);
        rateMINLOSMap.put("LV0", 0);
        expectedDateMinLOS.put(df.parse("2014-Sep-25"),rateMINLOSMap);
        org.junit.Assert.assertEquals(expectedDateMinLOS,minlos.generateDatewiseMINLOS(inputDateRateMap));

    }

    /*@Test
    public void test() throws ParseException {
        Map<String,String> rate_fplos = new TreeMap<String, String>();
        rate_fplos.put("RACK", "NYYYYYY");
        rate_fplos.put("LV0", "YYYYYYY");

        List<Map<String,Integer>> expectedrateFPLOSList = new ArrayList<Map<String, Integer>>();
        Map<Date,List<Map<String,Integer>>> expectedMap = new TreeMap<Date, List<Map<String, Integer>>>();
        Map<String,Integer> rateMINLOSMap = new TreeMap<String, Integer>();
        rateMINLOSMap.put("RACK", 2);
        rateMINLOSMap.put("LV0", 1);
        expectedrateFPLOSList.add(rateMINLOSMap);
        expectedMap.put(df.parse("2014-Sep-25"),expectedrateFPLOSList);

    }*/

}
