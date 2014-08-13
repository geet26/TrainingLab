package training.ideas.java.decisions;
/**
 * Created by idngeb on 2014-07-23.
 */
public class Decision {
     public static String generateFPLOSPattern(final double[] lrv,final double rate) {
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

    public static String[] generateFPLOSPattern(final double[] lrv, final double[] rateSpectrum) {
        String [] fplos_Pattern= new String[rateSpectrum.length];
        int counter=0;
        for(double rateValue:rateSpectrum){
            fplos_Pattern[counter++] = generateFPLOSPattern(lrv,rateValue);
        }
        return fplos_Pattern;
    }


    public static int generateMINLOS(final String fplos) {
        String fplos_Pattern = fplos.trim().toUpperCase();
        if(!fplos_Pattern.isEmpty()){
            return fplos_Pattern.indexOf("Y")+1;
        }
        else {
            return -1;
        }
    }


}














