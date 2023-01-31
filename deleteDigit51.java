package codeSignal;

public class deleteDigit51 {
    public static void main(String[] args) {
        System.out.println(solution(222250));
    }
    static int solution(int n) {

        String subString = String.valueOf(n).substring(1);
        int maxvalue = Integer.parseInt(subString);
        System.out.println(maxvalue);

        for (int i =1;i<String.valueOf(n).length();i++){
            subString = String.valueOf(n).substring(0,i)+String.valueOf(n).substring(i+1);
            maxvalue = Math.max(maxvalue,Integer.parseInt(subString));
        }


       return maxvalue;
    }
}
