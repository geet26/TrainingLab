package training.ideas.java.characteroperations;

/**
 * Created by idngeb on 2014-08-15.
 */
public class CaseConversion {
    enum caseType{
        LOWERCASE,UPPERCASE
    }
    private static char [] convertCase(char[] input ,caseType type ) {
        char [] output = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            //output[i]=type==caseType.LOWERCASE ? Character.toLowerCase(input[i]) : Character.toUpperCase(input[i]);
            output[i] = convert(input[i], type);
        }
        return output;
    }

    public static char[] convertToUpperCase(char[] input) {
        return convertCase(input,caseType.UPPERCASE);
    }
    public static char [] convertToLowerCase(char[] input) {
        return convertCase(input,caseType.LOWERCASE);
    }
    private static char convert(char character, caseType type){
       return    type==caseType.UPPERCASE ? (character >= 97 && character <= 122)? (char) (character - 32) : character :(character >= 65 && character <= 90) ?  (char) (character + 32) : character ;
    }
}
