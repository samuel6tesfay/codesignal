package codeSignal;

public class alphabeticShift28 {
    public static void main(String[] args) {
        System.out.println(solution("inpuz"));
    }
    static String solution(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        for (int i = 0 ; i < sb.length();i++){
            if(sb.charAt(i)=='z'){
                sb.replace(i,i+1,"a");

            }else{
                sb.replace(i,i+1,((char)(sb.codePointAt(i)+1))+"");

            }
        }
        return sb.toString();

    }

}
