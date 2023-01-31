package codeSignal.interviewQuestions;

public class rotateImage3AmWinApp {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] matrix = solution(grid);
        for (int i =0;i<grid.length;i++){
            for (int j=0;j<grid.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] solution(int[][] a) {

        int n = a.length;
        for(int i = 0; i < n / 2; i++){
            for(int j = i; j < n-i-1; j++){
                int temp = a[i][j];
                a[i][j] = a[n-j-1][i];
                a[n-j-1][i] = a[n-1-i][n-1-j];
                a[n-1-i][n-1-j] = a[j][n-1-i];
                a[j][n-1-i] = temp;
            }
        }
        return a;
    }
}
