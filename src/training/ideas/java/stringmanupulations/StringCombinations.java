package training.ideas.java.stringmanupulations;

/**
 * Created by idngeb on 2014-08-13.
 */
public class StringCombinations {
    public static String[] find(String input) {
        String strArr[] = new String[input.length()];
        if(input.length()==0){
            return  strArr;
        }
        else{
            strArr[0] = input;
            for (int i = 1; i < input.length() ; i++) {
                strArr[i] = input.substring(1,input.length()) + input.substring(0,1);
                input = strArr[i];
            }
            return strArr;
        }

    }
}
