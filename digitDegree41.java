package codeSignal;

public class digitDegree41 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    static int solution(int n) {
        int count = 0;
        int x = 0;
        int sum = 0;
        while(n>=10){
            while (n>0){
                x = n % 10;
                sum += x;
                n = n / 10;
            }
            count++;
            if (sum>=10){
                n = sum;
                sum = 0;
            }
        }
        return count;
    }
}
