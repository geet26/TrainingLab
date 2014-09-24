package training.ideas.java.decisions;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * Created by idngeb on 2014-09-18.
 */
public class Rate {
    private final String rateCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rate rate = (Rate) o;

        if (!rateCode.equals(rate.rateCode)) return false;
        if (!seasonList.equals(rate.seasonList)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rateCode.hashCode();
        result = 31 * result + seasonList.hashCode();
        return result;
    }

    private final List<Season> seasonList;

    public Rate(String rateCode, List<Season> seasonList) {
        this.rateCode = rateCode;
        this.seasonList = seasonList;
    }

    public String rateName() {
        return rateCode;
    }
    public double rateValueForDate(Date occDate) throws RateNotAvailableException {
        for (Season season : seasonList) {
            if (season.dateInSeason(occDate)) {
                return season.getRateValue(occDate);
            }
        }
        throw new RateNotAvailableException(rateCode);
    }

    public List<Season> addSeason(Season newSeason) throws OverlappingSeasonException {
        for (Season oldSeason : seasonList) {
            oldSeason.overlaps(newSeason);
        }
            seasonList.add(newSeason);
            return seasonList;
    }

}


































//    (StartA <= EndB)  and  (EndA >= StartB)
