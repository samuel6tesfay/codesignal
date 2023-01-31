package codeSignal;

public class stringsRearrangement33 {
    public static void main(String[] args) {
        String[] x = {"abc","afe","abe"};
        solution(x);
    }

   static boolean solution(String[] inputArray) {
        for (int i = 0; i < inputArray.length;i++){

            String[] tmpArray = new String[inputArray.length];
            tmpArray[0] = inputArray[i];
            int length = 1;
            for(int j = 0; j< inputArray.length;j++){
                int count = 0;
                for (int k = 0 ; k <inputArray[0].length();k++){
                    if(inputArray[i].charAt(k) != inputArray[j].charAt(k)){
                        count++;
                    }
                }
                if(count == 1){
                    String temp = inputArray[i+1];
                    inputArray[i+1] = inputArray[j];
                    inputArray[j] =  temp;
                    tmpArray[length] = inputArray[j];
                    length++;
                    j = length;

                }else {
                    if (j == inputArray.length -1){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
