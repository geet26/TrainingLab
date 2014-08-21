package training.ideas.java.charactermanipulations;

/**
 * Created by idngeb on 2014-08-14.
 */
public class Character_Index {
    private static int findIndex(char[] input, char search, int index) {
        int ptr = -1;
        for (int i = index; i < input.length ; i++) {
            if(search == input[i]){
                ptr = i;
                break;
            }
        }
        return ptr;
    }

    public static int getIndex(char[] input, char search) {
        return findIndex(input, search, 0);
    }
    public static int getIndex(char[] input, char search, int index) {
        return findIndex(input, search, index + 1);
    }
    public static int getOccurrence(char [] input , char search){
        int cnt = 0;
        for (int j =0; j < input.length ; j++) {
            if(input[j] == search){
                cnt++;
            }
        }
        return  cnt==0 ?-1 : cnt;
    }
}
