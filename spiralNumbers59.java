package codeSignal;

public class spiralNumbers59 {
    public static void main(String[] args) {
        int[][] matrix = solution(7);
        for (int i=0;i<matrix[0].length;i++){
            for (int j = 0 ; j<matrix[0].length;j++){
                if (matrix[i][j]<10){
                    System.out.print(matrix[i][j] + "         ");
                }else {
                    System.out.print(matrix[i][j] + "        ");
                }

            }
            System.out.println();
        }
    }
    static int[][] solution(int n) {
        int[][] matrix = new int[n][n];
        int count = 0;
        int intial = 0;
        while (n > 1){
            int i = 0;
            int j = n-1;
            int temintial = 0;
            while (i<n){
                if (matrix[count][i+count]==0){
                    matrix[count][i+count] = i+1+intial;
                }
                if (matrix[i+count][n-1+count]==0){
                    matrix[i+count][n-1+count] = i + n + intial;
                }
                if ( matrix[n-1+count][j+count]==0){
                    matrix[n-1+count][j+count] = i + 2*n -1 + intial;
                }
                if (matrix[j+count][count]==0){
                    matrix[j+count][count] = i + 3*n - 2 + intial;
                    temintial = matrix[j+count][count];

                }

                i++;
                j--;
            }
            count++;
            intial =  temintial;
            n = n - 2;
            if (n==1){
                matrix[count][count]=intial+1;
            }
        }
        return matrix;
    }
}
