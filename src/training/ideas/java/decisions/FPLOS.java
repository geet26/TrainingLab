package training.ideas.java.decisions;
import java.text.ParseException;
import java.util.*;

/**
 * Created by idngeb on 2014-09-09.
 */
public class FPLOS {

    private List<Rate> rateSpectrum = new ArrayList<Rate>();

    public FPLOS(List<Rate> rateSpectrum) {
        this.rateSpectrum = rateSpectrum;
    }
    public FPLOS(){

    }

    public String generateFPLOSPattern(final double[] lrv,final double rate) {
            StringBuilder fplos_Pattern_For_One_RateValue = new StringBuilder();
            double sum_LRV = 0d;
            for (int i = 0; i < lrv.length ; i++) {
                sum_LRV += lrv[i];
                if(rate*(i+1)>=sum_LRV)
                    fplos_Pattern_For_One_RateValue.append("Y");
                else
                    fplos_Pattern_For_One_RateValue.append("N");
            }

            return fplos_Pattern_For_One_RateValue.toString();
        }

        public  String[] generateFPLOSPattern(final double[] lrv, final double[] rateSpectrum) {
            String [] fplos_Pattern= new String[rateSpectrum.length];
            int counter=0;
            for(double rateValue:rateSpectrum){
                fplos_Pattern[counter++] = generateFPLOSPattern(lrv,rateValue);
            }
            return fplos_Pattern;
        }

    public String generateFPLOSPattern(final List<Double> lrv,final double rate) {
        double lrvArray[] = new double[lrv.size()];
        for (int i = 0; i < lrv.size(); i++) {
            lrvArray[i] = lrv.get(i);
        }
        return generateFPLOSPattern(lrvArray,rate);
    }

    public Map<Date, Map<String, String>> generateFPLOSPattern(Map<Date, List<Double>> date_wiseLRV) throws ParseException, RateNotAvailableException {
        Map<Date, Map<String, String>> expectedMap= new TreeMap<Date, Map<String, String>>();
        Set<Date> dateLRV = date_wiseLRV.keySet();
        for (Date occDate:dateLRV){
            Map<String,String> rateFPLOSMap = new HashMap<String, String>();
            for (Rate eachRate : rateSpectrum){
                rateFPLOSMap.put(eachRate.rateName(), generateFPLOSPattern(date_wiseLRV.get(occDate), eachRate.rateValueForDate(occDate)));
            }
            expectedMap.put(occDate, rateFPLOSMap);
        }
        return expectedMap;
    }
}
