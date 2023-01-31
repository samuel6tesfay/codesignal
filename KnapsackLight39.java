package codeSignal;

public class KnapsackLight39 {
    public static void main(String[] args) {

        System.out.println(solution(5,3,7,4,6));
    }
    static int  solution(int value1, int weight1, int value2, int weight2, int maxW) {
        if(maxW >= weight1+weight2) return value1 + value2;
        if(maxW >= weight1 && maxW >= weight2) return Math.max(value1,value2);
        if(maxW >= weight1 && maxW < weight2){
            return value1;
        }else if(maxW <= weight2 && maxW > weight1) {
            return value2;
        }
        if(maxW < weight1 && maxW < weight2) return 0;
        return Math.max(value1,value2);
    }
}
