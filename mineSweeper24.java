package codeSignal;

public class mineSweeper24 {
    public static void main(String[] args) {
        boolean[][] in = {{true,false,false},{false,true,false},{false,false,false}};
        solution(in);
    }

    static int[][] solution(boolean[][] matrix) {
        int[][] re = new int[matrix.length][matrix[0].length];
        for (int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                re[i][j] = 0;
                if(i > 0 && matrix[i-1][j]){
                    re[i][j] += 1;

                }
                if(i > 0 && j > 0 && matrix[i-1][j-1]){
                    re[i][j] += 1;
                }
                if(i > 0 && j < matrix[i].length-1 && matrix[i-1][j+1]){
                    re[i][j] += 1;
                }

                if(i < matrix.length-1 && matrix[i+1][j]){
                    re[i][j] += 1;

                }
                if(i < matrix.length-1 &&j > 0 && matrix[i+1][j-1]){
                    re[i][j] += 1;
                }
                if(i < matrix.length-1 &&j < matrix[i].length-1 && matrix[i+1][j+1]){
                    re[i][j] += 1;
                }
                if (j > 0 && matrix[i][j-1]){
                    re[i][j] += 1;
                }
                if(j < matrix[i].length-1 && matrix[i][j+1]){
                    re[i][j] += 1;
                }
                System.out.println(re[i][j]);
            }
        }
        return re;
    }
}
