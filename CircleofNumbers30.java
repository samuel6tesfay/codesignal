package codeSignal;

public class CircleofNumbers30 {
    public static void main(String[] args) {
        solution(10,2);
    }

    static  int solution(int n, int firstNumber) {
        int d = n / 2;
        if(firstNumber + d < n) return firstNumber + d;
        else return firstNumber - d;
    }
}
