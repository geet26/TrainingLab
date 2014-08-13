package training.ideas.java.compression_decompression;

import static java.lang.Character.isDigit;

/**
 * Created by idngeb on 2014-08-09.
 */
public class Compression {
    public static String compression(String str ){
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (int index = 0; index <str.length() ; index++) {
            if(index +1 < str.length() && str.charAt(index) == str.charAt(index +1)){
                cnt++;
                continue;
            }
            if(cnt >  1){
                sb.append(str.charAt(index -1)).append(cnt);
                cnt = 1;
            }
            else{
                sb.append(str.charAt(index));
            }
        }
        return sb.toString();
    }

    public static String decompression(String str){
        StringBuilder sb = new StringBuilder();
        int temp1 = 0,temp = 0 , cnt = 0,cntplace = 1;boolean flag = false;
        for (int i = 0; i < str.length() ; i++) {

            if( isDigit(str.charAt(i))){
                cnt = cntplace*10 + Character.getNumericValue(str.charAt(i));
                    /*if(flag == false)
                        cnt= Character.getNumericValue(str.charAt(i));
                    for (int j = i; j < str.length()-1 ; j++) {
                        if(i < str.length()-1 && isDigit(str.charAt(j))&& isDigit(str.charAt(j+1)) ){
                            flag = true;
                           cnt = Character.getNumericValue(str.charAt(j)+str.charAt(j+1));
                        }
                    }*/
            }
            if(cnt > 0){
                String cntlen = String.valueOf((cnt + "").length());
                for (int j =0; j < cnt-1 ; j++) {
                    //sb.append(str.charAt((Integer.parseInt(cntlen)-1-1)));
                    sb.append(str.charAt((temp)));
                }
                cnt=0;
                //i=Integer.parseInt(cntlen);
            }
            else{
                sb.append(str.charAt(i));
                temp = i;
                flag=false;
            }

        }
        return sb.toString();
    }
}
