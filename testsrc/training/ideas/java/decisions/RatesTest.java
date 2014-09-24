package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by idngeb on 2014-09-24.
 */
public class RatesTest {
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    @Test
    public void test_getRates() throws ParseException, SQLException, ClassNotFoundException {
        int propertyID =1;
        Rates rates = new Rates(propertyID);
        Assert.assertEquals(getRatesforProperty_1() , rates.getRates());
    }

    private List<Rate> getRatesforProperty_1() throws ParseException {
        Season season = new Season(df.parse("2013-02-01"),df.parse("2015-12-31"),229.0);
        List<Season> seasonList = new ArrayList<Season>();
        seasonList.add(season);
        Rate rate = new Rate("RACK",seasonList);
        List<Rate> rateList = new ArrayList<Rate>();
        rateList.add(rate);
        return rateList;
    }
}
