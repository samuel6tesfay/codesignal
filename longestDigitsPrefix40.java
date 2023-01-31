package codeSignal;

public class longestDigitsPrefix40 {
    public static void main(String[] args) {
        System.out.println(solution("0123456789"));
    }
    static String solution(String inputString) {
        int longestPrefix = 0;
        int start = 0;
        int templong = 0;
        int tempstart = 0;
        for (int i = 0;i<inputString.length();i++){
            if(48<=(int)inputString.charAt(i) && 57>=(int)inputString.charAt(i)){
//                System.out.println((int)inputString.charAt(i));
               if(templong == 0 && i == 0){
                   tempstart = i;
               }
               templong++;
            }else {
                break;
            }
            if(templong != 0 && longestPrefix < templong){
                longestPrefix = templong;
                start = tempstart;
            }


        }
        return inputString.substring(start,start+longestPrefix);
    }
}
