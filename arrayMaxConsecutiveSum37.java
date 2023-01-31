package codeSignal;

public class arrayMaxConsecutiveSum37 {

    public static void main(String[] args) {
        int[] inte = {1,3,5,6};
        System.out.println(solution(inte,2));
    }

    static int solution(int[] inputArray, int k) {
        int max = 0;
        int tempMax = 0;
        for (int i = 0 ; i<inputArray.length-k;i++){
            tempMax = 0;
            for(int j = i ; j<i+k;j++){
                tempMax += inputArray[j];
            }
            max = Math.max(max,tempMax);
        }
        return max;
    }
}
