package training.ideas.java.decisions;
import org.junit.Assert;
import org.junit.Test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by idngeb on 2014-09-18.
 */
public class SeasonTest {
    DateFormat sfd = new SimpleDateFormat("dd-MMM-yyyy");
    Double rateValue = 100d;
    Season season = null;
    public SeasonTest() throws ParseException {
        Date startDate = sfd.parse("01-Jan-2015");
        Date endDate = sfd.parse("10-Jan-2015");
        season  = new Season(startDate,endDate,rateValue);
    }
    @Test
    public void test_getRateValueForSeason() throws ParseException {
        Assert.assertEquals(rateValue,season.getRateValue());
   }
    @Test
    public void test_OccupancyDateEqualsStartDate() throws ParseException {
        Date occupancyDate = sfd.parse("01-Jan-2015");
        Assert.assertTrue(season.dateInSeason(occupancyDate));
    }
    @Test
    public void test_OccupancyDateEqualsEndDate() throws ParseException {
        Date occupancyDate = sfd.parse("10-Jan-2015");
        Assert.assertTrue(season.dateInSeason(occupancyDate));
    }
    @Test
    public void test_OccupancyDateInBetweenSeason() throws ParseException {
        Date occupancyDate = sfd.parse("05-Jan-2015");
        Assert.assertTrue(season.dateInSeason(occupancyDate));
    }
    @Test
    public void test_OccupancyDateIsNotInBetweenSeason() throws ParseException {
        Date occupancyDate = sfd.parse("15-Jan-2015");
        Assert.assertFalse(season.dateInSeason(occupancyDate));
    }
    @Test
    public void test_RateValueForaOccupancyDatePresentInSeason() throws ParseException {
        rateValue = 250.00;
        season = new Season(sfd.parse("01-Sep-2014"),sfd.parse("03-Sep-2014"),rateValue);
        Assert.assertEquals(rateValue,season.getRateValue(sfd.parse("02-Sep-2014")));
    }
    @Test
    public void test_RateValueForaOccupancyDateNotPresentInSeason() throws ParseException {
        rateValue = 250.00;
        season = new Season(sfd.parse("01-Sep-2014"),sfd.parse("03-Sep-2014"),rateValue);
        Assert.assertEquals(-1,season.getRateValue(sfd.parse("04-Sep-2014")),0);
    }

    @Test
    public void test_add_a_non_overlappingSeason() throws ParseException, OverlappingSeasonException {
        Season newSeason =new Season( sfd.parse("21-Jan-2015"), sfd.parse("25-Jan-2015"),200.00);
        season.overlaps(newSeason);
    }
    @Test
    public void test_add_a_overlappingSeason_within_existing_season() throws ParseException, OverlappingSeasonException {
        Season newSeason =new Season( sfd.parse("02-Jan-2015"), sfd.parse("05-Jan-2015"),200.00);
        try {
            season.overlaps(newSeason);
            Assert.fail("Expecting an exception...");
        }
        catch (OverlappingSeasonException e){
            Assert.assertEquals("New Season with startFri Jan 02 00:00:00 IST 2015andMon Jan 05 00:00:00 IST 2015 is overlapping with seasonThu Jan 01 00:00:00 IST 2015ToSat Jan 10 00:00:00 IST 2015",e.getMessage());
        }
    }
    @Test(expected = OverlappingSeasonException.class )
    public void test_existing_season_within_new_season() throws ParseException, OverlappingSeasonException {
        Season newSeason =new Season( sfd.parse("01-Dec-2014"), sfd.parse("25-Jan-2015"),200.00);
        season.overlaps(newSeason);
    }
    @Test(expected = OverlappingSeasonException.class)
    public void test_newSeason_EndDate_overlaps_with_existing_season() throws ParseException, OverlappingSeasonException {
        Season newSeason =new Season( sfd.parse("29-Dec-2014"), sfd.parse("03-Jan-2015"),200.00);
       season.overlaps(newSeason);
    }
    @Test(expected = OverlappingSeasonException.class)
    public void test_newSeason_startDate_overlaps_with_existing_season() throws ParseException, OverlappingSeasonException {
        Season newSeason =new Season( sfd.parse("09-Jan-2015"), sfd.parse("11-Jan-2015"),200.00);
        season.overlaps(newSeason);
    }



}
