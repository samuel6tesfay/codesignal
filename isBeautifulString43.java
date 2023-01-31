package codeSignal;

public class isBeautifulString43 {
    public static void main(String[] args) {
        System.out.println(solution("aabbb"));
    }

    static boolean solution(String inputString) {
        int[] alpha = new int[26];
        for (int i = 0 ; i < inputString.length();i++){
            alpha[(int)inputString.charAt(i)-97]++;
        }
        int temp=-1;
        for (int i:alpha){
            if(temp < i && temp != -1){
                return false;
            }
            temp = i;
        }
        return true;
    }
}