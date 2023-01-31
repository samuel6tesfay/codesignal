package codeSignal;

import java.util.regex.Pattern;

public class isDigit48 {
    public static void main(String[] args) {

    }
    static boolean solution(char symbol) {
        return Pattern.matches("[0-9]{1}", symbol+"");
    }
}
