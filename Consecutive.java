package codeSignal;

import java.util.Arrays;

public class Consecutive {
    public static void main(String[] args) {

        int[] x = {1,10,2,6,3};
        solution(x);
        System.out.println(solution(x));
    }

   public static int solution(int[] statues) {
        Arrays.sort(statues);
        int neededArray = 0;
        for(int i = 0 ; i < statues.length - 1 ; i++){
            if(statues[i+1]-statues[i] > 0){
                neededArray = neededArray + (statues[i+1]-statues[i]-1);
            }
        }
        return neededArray;
    }

}
