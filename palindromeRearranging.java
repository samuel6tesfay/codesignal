package codeSignal;

public class palindromeRearranging {
    public static void main(String[] args) {
        System.out.println(solution("a"));
        System.out.println(solution(""));
        System.out.println(solution("aba"));
        System.out.println(solution("aabb"));
        System.out.println(solution("aabbc"));
        System.out.println(solution("dababab"));
    }
    static boolean  solution(String inputString) {
        int count = 0;
        while(inputString.length()>1){
            if(inputString.substring(1).contains(inputString.charAt(0)+"")){
                System.out.println(inputString);
                inputString = inputString.substring(1).replaceFirst(inputString.charAt(0)+"", "");
            }else{
                if(inputString.length()%2==0){
                    System.out.println("c");
                    return false;
                }else{
                    System.out.println(inputString.charAt(0));
                    System.out.println(inputString);

                    inputString = inputString.replaceFirst(inputString.charAt(0)+"", "");
                    System.out.println(inputString);

                    count++;
                }
            }
            if (count > 1) return false;

        }
        return true;
    }
}
