package training.ideas.java.calculator;

/**
 * Created by idngeb on 2014-07-21.
 */
public class Addition {
    public static double performAddition(double...double_numbers){
        double sum_double=0;
        for(double doubleElement:double_numbers){
            sum_double += doubleElement;
        }
        return sum_double;
    }
    public static int performAddition(int[] array) {
        int integer_result = 0;
        for (int individualElement : array)
            integer_result += individualElement;
        return integer_result;
    }

}





















/* using constructor
   // when final is used its value can not be modified
    public final double first;
    private final double second;


    public Addition(double first, double second) {
        this.first = first;
        this.second = second;
    }

     public double add() {

         return first+second;
    }
  using constructor */

    /*Approach I - No need to add one more constructor if implementing below method - Typecasting*/
    /*
    public int addInt(){

        return (int)first+(int)second;
    }
*/

/*Approach II -Add a new method , without using constructor*/


