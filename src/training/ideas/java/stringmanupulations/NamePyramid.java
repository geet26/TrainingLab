package training.ideas.java.stringmanupulations;

/**
 * Created by idngeb on 2014-08-19.
 */
public class NamePyramid {
        public static void name_pyramid(){
            String name = "Geetanjali";
            String  namrarr = "";
            String result="";
            String space = "";
            int namelength= name.length();
            for (int i = 0; i <namelength ; i++) {
                space="";
                namrarr = name.substring(i,i+1);
                result = namrarr+result+namrarr;
                for (int j =namelength-1; j >i ; j--) {
                    space +=" ";
                }
                for(int x=1;x<=5;x++)
                    System.out.print(space + result + space);
               System.out.print("\n");
            }
            name=space+result+space;
            for (int i = 0; i < namelength  ; i++) {
                space="";
                name = name.substring(1,name.length() - 1);
                for (int j = 0; j <= i ; j++) {
                    space +=" ";
                }
                for(int x=1;x<=5;x++)
                    System.out.print(space + name + space);
              System.out.print("\n");
            }

        }


    public static void main(String args[]){
        name_pyramid();
    }



}
