package codeSignal;

public class evenDigitsOnly26 {

    public static void main(String[] args) {
        System.out.println(solution(1000000000));
    }

    static boolean solution(int n) {
        int d;
        while (n>=10){
            d = n % 10;
            System.out.println(d);
            if(d%2!=0){
                return false;
            }
            n = n / 10;
        }
        System.out.println(n);
        if(n%2==0) return true;
        return false;
    }
}
