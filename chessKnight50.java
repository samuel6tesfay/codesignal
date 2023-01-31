package codeSignal;

import java.util.regex.Pattern;

public class chessKnight50 {
    public static void main(String[] args) {
        String cell = "a1";
        System.out.println(solution(cell));
    }
    static int solution(String cell) {

        int count = 0;

        if (Pattern.matches("[A-H]{1}", (char)((int)cell.charAt(0)-1)+"") && Pattern.matches("[1-8]{1}", String.valueOf(Integer.parseInt(cell.charAt(1)+"")+2))) count++;
        if (Pattern.matches("[A-H]{1}", (char)((int)cell.charAt(0)-1)+"") && Pattern.matches("[1-8]{1}", String.valueOf(Integer.parseInt(cell.charAt(1)+"")-2))) count++;

        if (Pattern.matches("[A-H]{1}", (char)((int)cell.charAt(0)-2)+"") && Pattern.matches("[1-8]{1}", String.valueOf(Integer.parseInt(cell.charAt(1)+"")+1))) count++;
        if (Pattern.matches("[A-H]{1}", (char)((int)cell.charAt(0)-2)+"") && Pattern.matches("[1-8]{1}", String.valueOf(Integer.parseInt(cell.charAt(1)+"")-1))) count++;

        if (Pattern.matches("[A-H]{1}", (char)((int)cell.charAt(0)+1)+"") && Pattern.matches("[1-8]{1}", String.valueOf(Integer.parseInt(cell.charAt(1)+"")+2))) count++;
        if (Pattern.matches("[A-H]{1}", (char)((int)cell.charAt(0)+1)+"") && Pattern.matches("[1-8]{1}", String.valueOf(Integer.parseInt(cell.charAt(1)+"")-2))) count++;

        if (Pattern.matches("[A-H]{1}", (char)((int)cell.charAt(0)+2)+"") && Pattern.matches("[1-8]{1}", String.valueOf(Integer.parseInt(cell.charAt(1)+"")+1))) count++;
        if (Pattern.matches("[A-H]{1}", (char)((int)cell.charAt(0)+2)+"") && Pattern.matches("[1-8]{1}", String.valueOf(Integer.parseInt(cell.charAt(1)+"")-1))) count++;

        return count;
    }
}
