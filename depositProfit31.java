package codeSignal;

public class depositProfit31 {

    public static void main(String[] args) {
        solution(100,20,170);
    }

    static int solution(int deposit, int rate, int threshold) {

        int year = 0;
        double doublelDeposit = (double)deposit;
        while((doublelDeposit) < (threshold )){
            year = year  + 1;
            doublelDeposit +=  (doublelDeposit * rate / 100);
        }
        return year;
    }
}

