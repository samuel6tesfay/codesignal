package codeSignal;

public class absoluteValuesSumMinimization32 {
    public static void main(String[] args) {
        int[] x = {2,4,7};
        solution(x);
    }
    static  int solution(int[] a) {

        int minValue = 0;
        int closest = a[0];
        int totalSum = 0;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0; j < a.length;j++){
                totalSum = totalSum + Math.abs(a[i]-a[j]);
            }
            if(i!=0){
                closest = minValue > totalSum ? a[i]:closest;
                minValue = Math.min(minValue,totalSum);

            }else  minValue = totalSum;
            totalSum = 0;
        }
        System.out.println(closest);
        return closest;

    }

}
