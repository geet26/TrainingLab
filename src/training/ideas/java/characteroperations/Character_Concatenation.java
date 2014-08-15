package training.ideas.java.characteroperations;

/**
 * Created by idngeb on 2014-08-14.
 */
public class Character_Concatenation {
    public static char[] concat(final char[] input1, final char[] input2) {
       char[] output = new char[input1.length+input2.length];
       int cnt1 = 0, cnt2 = 0;
           for(; cnt1 <=input1.length-1; cnt1++) {
               output[cnt1] = input1[cnt1];
           }
           for(; cnt1 <=output.length-1; cnt1++, cnt2++) {
               output[cnt1] = input2[cnt2];
           }
            return output;
    }
}
