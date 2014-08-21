package training.ideas.java.stringmanupulations;

/**
 * Created by idngeb on 2014-08-17.
 */
public class Index_String {
    public static int getIndex(String input, char search) {
        return getIndex(input,search,0);
    }

    public static int getIndex(String input, char search, int index) {
        return input.indexOf(search,index);
    }

    public static int getCount(String input, char search)
    {
        int cnt = -1;
        int no = 0;
        if(input.length()>0) {
            for (cnt = cnt+1; cnt < input.length(); cnt++) {
                 if(input.charAt(cnt) == search){
                     no = no+1;
                 }
            }
            return no;
        }
            return cnt;
    }
}
