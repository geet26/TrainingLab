package training.ideas.java.charactermanipulations;


/**
 * Created by idngeb on 2014-08-17.
 */
public class IndexOfArray {
    public static int getArrayIndex(char[] input, char[] search_arr, int s_index) {
        boolean flag = true;
        if(input.length == 0 || search_arr.length == 0 || search_arr.length > input.length){
            return -1;
        }
        for (int f_index = s_index; f_index < input.length; f_index++) {
            if(input[f_index] == search_arr[0]){
                 flag = true;
            }
            for (s_index = 0; s_index < search_arr.length; s_index++) {
                if(Character.toLowerCase(search_arr[s_index])!=Character.toLowerCase(input[f_index + s_index]) || input.length <= f_index + s_index){
                    flag =false;
                    break;
                }
            }
            if(flag==true){
                return f_index;
            }
        }

      return -1;
    }

    public static int findArrayIndex(char[] input, char[] search_arr, int index) {
     return getArrayIndex(input,search_arr,index);
    }
    public static int findArrayIndex(char[] input, char[] search_arr) {
        return getArrayIndex(input,search_arr,0);
    }
}
