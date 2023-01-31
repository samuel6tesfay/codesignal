package codeSignal;

import java.util.Arrays;

public class ArrayReplace25 {
    public static void main(String[] args) {
        int[] or = {1,3,1};
        solution(or,1,2);
    }

    static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        return Arrays.stream(inputArray).map(o -> o == elemToReplace ? substitutionElem : o).toArray();
    }
}
