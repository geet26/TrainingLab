package training.ideas.java.decisions;

import java.util.Date;
import java.util.List;

/**
 * Created by idngeb on 2014-09-18.
 */
public class Rate {
    private final String rateCode;
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
