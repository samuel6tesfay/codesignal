package codeSignal;

import java.util.regex.Pattern;

public class longestWord51 {

    public static void main(String[] args) {
        String text = "To be or not to be";
        System.out.println(solution(text));
    }
    static String solution(String text) {
        int index = 0;
        int count = 0;
        String LongestWord="";
        boolean isLetter = false;
        for (int i =0;i<text.length();i++){
            isLetter = Pattern.matches("[A-Za-z]{1}", text.charAt(i)+"");//true
            if (isLetter){
                if(count==0)index=i;
                count++;
                if (i == text.length()-1){
                    if(LongestWord.length()<text.substring(index,index+count).length()){
                        LongestWord = text.substring(index,index+count);
                    }
                }

            }else {
                if(LongestWord.length()<text.substring(index,index+count).length()){
                    LongestWord = text.substring(index,index+count);
                }
                count = 0;
            }
        }
        return LongestWord;
    }
}
