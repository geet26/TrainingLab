package training.ideas.java.decisions;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

/**
 * Created by idngeb on 2014-09-18.
 */
public class Season {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Season season = (Season) o;

        if (!endDate.equals(season.endDate)) return false;
        if (!rateValue.equals(season.rateValue)) return false;
        if (!startDate.equals(season.startDate)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        result = 31 * result + rateValue.hashCode();
        return result;
    }

    public final Date startDate;
    public final Date endDate;
    private final Double rateValue;


    public Season(Date startDate, Date endDate, Double rateValue) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.rateValue = rateValue;
    }

    public Double getRateValue() {
        return rateValue;
    }

    public boolean dateInSeason(Date occDate) {
        return occDate.compareTo(startDate)>=0 && occDate.compareTo(endDate)<=0;
    }

    public Double getRateValue(Date occDate) {
        return dateInSeason(occDate) ? rateValue : -1;
    }

    public  void overlaps(Season newSeason) throws OverlappingSeasonException {
        if ( (newSeason.startDate.compareTo(endDate)<=0 ) && (newSeason.endDate.compareTo(startDate)>=0) ) {
            throw new OverlappingSeasonException(newSeason.startDate,newSeason.endDate,startDate,endDate);
        }
    }

}
