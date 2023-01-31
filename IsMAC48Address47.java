package codeSignal;

import java.util.regex.Pattern;

public class IsMAC48Address47 {

    public static void main(String[] args) {
        String inputString = "00-1B-63-84-45-E6";
        System.out.println(solution(inputString));
    }

    static boolean solution(String inputString) {
        if(inputString.length() != 17){
            return false;
        }
        boolean isValid = false;
        int k = 2;
        for (int i = 0 ; i < inputString.length() ; i++){
            if(k == i){
                isValid = inputString.charAt(i) == '-';
                k = k + 3;
            }else {
                isValid = Pattern.matches("[0-9A-F]{1}", inputString.charAt(i)+"");

            }
            if (!isValid) return false;
        }
        return true;
    }
}
