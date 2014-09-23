package training.ideas.java.decisions;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by idngeb on 2014-09-11.
 */
public class MINLOS {

    public int generateMINLOS(final String fplos) {
        String fplos_Pattern = fplos.trim().toUpperCase();
        if(!fplos_Pattern.isEmpty()){
            return fplos_Pattern.indexOf("Y")+1;
        }
        else {
            return -1;
        }
    }

    public Map<String, Integer> generateMINLOS(Map<String, String> input_rateFPLOSMap) {
        Map<String,Integer> rateMinLOS = new TreeMap<String, Integer>();
        Set<String> rateCodes = input_rateFPLOSMap.keySet();
        for(String rateCodeKey:rateCodes){
            rateMinLOS.put(rateCodeKey,generateMINLOS(input_rateFPLOSMap.get(rateCodeKey)));
        }
        return rateMinLOS;
    }


    public Map<Date,Map<String,Integer>> generateDatewiseMINLOS(Map<Date, Map<String, String>> inputDateRateMap) {
        Map<Date, Map<String, Integer>> dateRateMap = new TreeMap<Date, Map<String, Integer>>();
        Set<Date> dates = inputDateRateMap.keySet();
        for(Date dateKey:dates){
            dateRateMap.put(dateKey,generateMINLOS(inputDateRateMap.get(dateKey)));
        }
        return dateRateMap;
    }
}
