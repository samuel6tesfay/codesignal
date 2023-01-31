package codeSignal;

import java.util.ArrayList;

public class isIPv4Address {
    public static void main(String[] args) {
        System.out.println(solution("000.0.0.00"));
    }

    static boolean solution(String inputString) {
        String[] ip = inputString.split("[.]");
        if(ip.length!=4)return false;
        for (int i = 0 ; i < ip.length;i++){

            try {
                System.out.println(Integer.parseInt(ip[i]));
                if( Integer.parseInt(ip[i]) > 255 || Integer.parseInt(ip[i]) < 0){
                    return false;
                }
                if(ip[i].length()>=2 && ip[i].charAt(0)== '0'){
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }

        }
        return true;
    }

}
