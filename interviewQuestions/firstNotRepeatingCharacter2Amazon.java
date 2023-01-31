package codeSignal.interviewQuestions;

public class firstNotRepeatingCharacter2Amazon {
    public static void main(String[] args) {

    }
    char solution(String s) {
        char firstI = '_';
        for (int i=0;i<s.length();i++){
            if(!s.substring(i+1).contains(s.charAt(i)+"")){
                if (i!=0){
                    if(!s.substring(0,i).contains(s.charAt(i)+"")){
                        return s.charAt(i);
                    }
                }else {
                    return s.charAt(i);
                }

            }

        }
        return firstI;
    }
}
