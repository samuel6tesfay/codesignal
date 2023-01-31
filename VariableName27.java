package codeSignal;

import java.util.regex.Pattern;

public class VariableName27 {
    public static void main(String[] args) {
        System.out.println(solution("_c_1bb1daa"));
    }

    static boolean solution(String name) {
        return  Pattern.matches("[a-z_A-Z]{1}\\w*", name);//true

    }
}
