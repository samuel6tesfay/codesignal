package codeSignal;

public class digitsProduct57 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }
    static int solution(int product) {
        int multi=-1;

        for (int i=0;i<product*product;i++){
            int n = i;
            int m = 1;
            while (n>0){
                m = m * (n%10);
                n = n / 10;
            }
            if (product == m){
                multi = i;
                break;
            }
        }
        return multi;
    }
}
