package codeSignal;

public class buildPalindrome45 {
    public static void main(String[] args) {;
//        solution("daam");
        System.out.println(solution("abcabc"));
//        abcdcba
    }
    static String  string = "";
    static int count = 0;
    static String substring="";

    static String solution(String st){
        if(string.length()==0){
            substring = st;
        }
        for (int i = 0 ; i < st.length()/2+1;i++){
            if(st.charAt(i) != st.charAt(st.length()-1-i)){
                string = st.charAt(0) + string;
                count++;
                break;
            }else {
                count = 0;

            }
        }
//        substring = substring + st.charAt(0);
        st = st.substring(1);

        if (count!=0){
//            count = 0;
            solution(st);
        }
        return substring+string;
    }




}
