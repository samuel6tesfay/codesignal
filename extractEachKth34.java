package codeSignal;

import java.util.ArrayList;
import java.util.List;

public class extractEachKth34 {

    public static void main(String[] args) {
            int[] arr = {2, 4, 6, 8, 10};
            solution(arr,2);
    }

    static int[] solution(int[] inputArray, int k) {
        List<Integer>  list = new ArrayList<>();
        int kth = k - 1;
        for (int i = 0 ; i < inputArray.length;i++){

            if(i != kth){
                list.add(inputArray[i]);

            }else {
                kth += k;
            }

        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
