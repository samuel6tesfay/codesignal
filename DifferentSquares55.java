package codeSignal;

public class DifferentSquares55 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 1},
                {2, 2, 2},
                {2, 2, 2},
                {1, 2, 3},
                {2, 2, 1}};
        System.out.println(solution(matrix));
    }
    static int solution(int[][] matrix) {
        String str = "";
        int count = 0;
        for (int i =0;i<matrix.length-1;i++){
            for (int j = 0 ; j < matrix[i].length-1;j++){
                if (!str.contains(matrix[i][j]+""+matrix[i][j+1] + "" +matrix[i+1][j]+""+matrix[i+1][j+1])){
                    str = str + "  " + matrix[i][j]+""+matrix[i][j+1] + "" +matrix[i+1][j]+""+matrix[i+1][j+1];
                    count++;
                }
            }
        }
        return count;
    }

}
