package codeSignal;

public class lineEncoding49 {

    public static void main(String[] args) {
        String str = "aabbbc";
        System.out.println(solution(str));
    }
    static String solution(String s) {
        String str = "";
        int count = 1;
        if (s.length() == 1) return s;
        for (int i = 0 ; i < s.length();i++){
            if (i == s.length()-1){
                if(s.charAt(i)==s.charAt(i-1)){
                    str = str+count+s.charAt(i);
                    return str;
                }else {
                    str = str+s.charAt(i);
                    return str;
                }
            }
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }else if(count>1){
                str = str+count+s.charAt(i);
                count = 1;
            }else {
                str = str+s.charAt(i);
                count = 1;
            }
        }
        return str;
    }
}
