package training.ideas.java.decisions;

import java.util.Date;

/**
 * Created by idngeb on 2014-09-18.
 */
public class Season {
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
