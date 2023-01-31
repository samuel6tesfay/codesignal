package codeSignal;

import java.util.regex.Pattern;

public class ValidTime53 {
    public static void main(String[] args) {
        String time = "13:58";
        System.out.println(solution(time));
    }

    static boolean solution(String time) {
        if(time.length()!=5)return false;
        boolean isValid=true;

        if(Integer.parseInt(time.substring(0,2))>24)isValid=false;
        if(Integer.parseInt(time.substring(3))>60)isValid=false;
        if(time.charAt(2)!=':')isValid=false;

        return isValid;
    }

}
