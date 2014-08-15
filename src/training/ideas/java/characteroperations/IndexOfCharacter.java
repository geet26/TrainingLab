package training.ideas.java.characteroperations;

/**
 * Created by idngeb on 2014-08-14.
 */
public class IndexOfCharacter {
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
}
