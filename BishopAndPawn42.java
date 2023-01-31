package codeSignal;

public class BishopAndPawn42 {
    public static void main(String[] args) {
        System.out.println(solution("h1","h3"));
    }
    static boolean solution(String bishop, String pawn) {
        return Math.abs((int)bishop.charAt(0) - (int)pawn.charAt(0)) == Math.abs((int)bishop.charAt(1) - (int)pawn.charAt(1));
    }
}
