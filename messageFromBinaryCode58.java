package codeSignal;

public class messageFromBinaryCode58 {
    public static void main(String[] args) {
        String code = "010010000110010101101100011011000110111100100001";
        System.out.println(solution(code));
    }
    static String solution(String code) {
        String text="";
        int i = 0;

        while (i<code.length()){
            text = text + (char)Integer.parseInt(code.substring(i,i+8),2);
            i = i + 8;
        }
        return text;
    }
}
