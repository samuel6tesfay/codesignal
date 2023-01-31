package codeSignal;

public class differentSymbolsNaive36 {
    public static void main(String[] args) {
        String s = "abbcdeecf";
        System.out.println(solution(s));
    }
    static int solution(String s) {
        int count = 0;
        for (int i=0;i<s.length();i++){
            if(!s.substring(0,i).contains(s.charAt(i)+"")){
                count++;
            }
        }
        return count;
    }
}
