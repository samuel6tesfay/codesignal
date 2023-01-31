package codeSignal;

public class ChessBoardCellColor29 {
    public static void main(String[] args) {
        solution("A1","B2");
    }

    static boolean solution(String cell1, String cell2) {
        System.out.println((char)(97));
        System.out.println((int)'a');
        int codePoint1 = (int)cell1.charAt(0) + Integer.parseInt(cell1.charAt(1)+"");
        int codePoint2 = (int)cell2.charAt(0) + Integer.parseInt(cell2.charAt(1)+"");
        if(codePoint1 % 2 == codePoint2 % 2) return true;
        return false;
    }

}
