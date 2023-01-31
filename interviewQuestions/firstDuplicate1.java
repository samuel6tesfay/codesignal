package codeSignal.interviewQuestions;

public class firstDuplicate1 {
    public static void main(String[] args) {

    }
    static int solution(int[] a) {

        int minIndex = -1;
        int num = -1;
        for (int i=0;i<a.length;i++){
            for (int j = i;j<a.length;j++){
                if (a[i] == a[j]){
                    if (minIndex == -1){
                        minIndex = j;
                        num = a[j];
                    }else {
                        if (minIndex > j){
                            minIndex = Math.min(minIndex,j);
                            num = a[j];

                        }
                    }


                }
            }
        }

        return num;
    }
}
