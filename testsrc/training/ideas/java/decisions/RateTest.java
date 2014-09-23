package training.ideas.java.decisions;

import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by idngeb on 2014-09-18.
 */
public class RateTest {
    DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
    Season season = null;
    Rate rate = null;
    String rateCode = "";
    List<Season> seasonList = new ArrayList<Season>();

      public RateTest() throws ParseException {
          rateCode = "RACK";
          seasonList.add(new Season(df.parse("01-Sep-2014"),df.parse("05-Sep-2014"),200.00));
          seasonList.add(new Season(df.parse("06-Sep-2014"),df.parse("10-Sep-2014"),250.00));
          seasonList.add(new Season(df.parse("11-Sep-2014"),df.parse("12-Sep-2014"),180.00));
          rate = new Rate(rateCode,seasonList);
      }
    @Test
    public void test_get_RateName() throws ParseException {
        Assert.assertEquals("RACK", rate.rateName());
    }

    @Test
    public void test_get_rate_value_for_occupancyDate() throws ParseException, RateNotAvailableException {
        Assert.assertEquals(250.00, rate.rateValueForDate(df.parse("07-Sep-2014")), 0);
    }

    @Test
    public void test_add_season() throws Exception, OverlappingSeasonException {
        season = new Season(df.parse("17-Sep-2014"), df.parse("19-Sep-2014"), 250.00);
        List<Season> expected_seasonList = getSeasonList();
        expected_seasonList.add(new Season(df.parse("17-Sep-2014"), df.parse("19-Sep-2014"), 250.00));
        List<Season> actualList= rate.addSeason(season);
        Assert.assertEquals("Overlapping Season List !! Size does not match",expected_seasonList.size(),actualList.size());
        boolean flag = true;
        for (int i = 0; i < expected_seasonList.size(); i++) {
             flag = flag && compareSeason(expected_seasonList.get(i), actualList.get(i));
        }
        Assert.assertTrue("Lists are not equal",flag);
    }

    private List<Season> getSeasonList() throws ParseException {
        List<Season> expected_seasonList = new ArrayList<Season>();
        expected_seasonList.add(new Season(df.parse("01-Sep-2014"), df.parse("05-Sep-2014"), 200.00));
        expected_seasonList.add(new Season(df.parse("06-Sep-2014"),df.parse("10-Sep-2014"),250.00));
        expected_seasonList.add(new Season(df.parse("11-Sep-2014"),df.parse("12-Sep-2014"),180.00));
        return expected_seasonList;
    }

    @Test(expected = OverlappingSeasonException.class)
    public void test_add_a_season_which_is_within_a_list() throws ParseException, OverlappingSeasonException {
        season = new Season(df.parse("07-Sep-2014"), df.parse("13-Sep-2014"), 250.00);
        List<Season> expected_seasonList = getSeasonList();
        List<Season> actualList= rate.addSeason(season);
        Assert.assertEquals("Overlapping List !! Size does not match",expected_seasonList.size(),actualList.size());
        boolean flag = true;
        for (int i = 0; i < expected_seasonList.size(); i++) {
            flag = flag && compareSeason(expected_seasonList.get(i),actualList.get(i));
        }
        Assert.assertFalse("Lists are not equal", flag);
    }


    private boolean compareSeason(Season season, Season newSeason) {
      return (season.startDate.equals(newSeason.startDate) && season.endDate.equals(newSeason.endDate) && season.getRateValue().equals(newSeason.getRateValue()));
    }






}
