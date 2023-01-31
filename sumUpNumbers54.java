package codeSignal;

import java.util.regex.Pattern;

public class sumUpNumbers54 {
    public static void main(String[] args) {
        String inputString = "2455";
        System.out.println(solution(inputString));
    }
    static int solution(String inputString) {
        int sum = 0;
        int index = 0;
        int count = 0;

        boolean isNumber = false;
        for (int i=0;i<inputString.length();i++){
            isNumber = Pattern.matches("[0-9]{1}", inputString.charAt(i)+"");//true
            if (isNumber){
                if(count==0)index=i;
                count++;
                if (i == inputString.length()-1){
                    sum = sum + Integer.parseInt(inputString.substring(index,index+count));
                }

            }else if(count!=0){
                    sum = sum + Integer.parseInt(inputString.substring(index,index+count));
                    count = 0;
                    isNumber = false;
            }else {
                count = 0;
            }

        }

        return sum;
    }
}
