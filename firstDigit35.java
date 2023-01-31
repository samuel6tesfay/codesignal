package codeSignal;

public class firstDigit35 {
    public static void main(String[] args) {
        char c='a';
        char c2='9';
        int a=c;
        int b=c2;

        String str = "a51bcdef";
        solution(str);
    }

    static char solution(String inputString) {
        char c='a';
        for(int i = 0 ;i<inputString.length();i++){
            if(48<=(int)inputString.charAt(i) && 57>=(int)inputString.charAt(i)){
                c = inputString.charAt(i);
                System.out.println(inputString.charAt(i));
                break;
            }
        }
        return c!='a'?c:null;
    }
}
