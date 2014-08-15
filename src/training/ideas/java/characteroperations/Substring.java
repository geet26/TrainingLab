package training.ideas.java.characteroperations;

/**
 * Created by idngeb on 2014-08-15.
 */
public class Substring {
    private static char[] find_Sub_String(char[] input,int s_index, int e_index,int output_Len) {
        char [] output ={};
        int k = 0;
        if(input.length > 0 && e_index <= input.length && s_index <= input.length ) {
            output= new char[e_index-s_index+1];
            for (int i = s_index; i <= output_Len; i++,k++) {
                output[k] = input[i];
            }
            return output;
        }
        else{
            return output;
        }
    }

    public static char[] getstring(char[] input, int start_index, int end_index) {
           return find_Sub_String(input,start_index,end_index,end_index-start_index+1);
    }
    public static char[] getstring(char[] input,int end_index) {
        return find_Sub_String(input,0,end_index,end_index);
    }
}
