package training.ideas.java.stringmanupulations;

/**
 * Created by idngeb on 2014-08-17.
 */
public class SubString {
    public static String getString(String input, int index) {
            return getString(input,0,index);
    }

    public static String getString(String input, int s_index, int e_index) {
        return s_index<= input.length() && e_index<= input.length() ? input.substring(s_index,e_index+1) : "";
    }
}
