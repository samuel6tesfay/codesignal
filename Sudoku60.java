package codeSignal;

public class Sudoku60 {
    public static void main(String[] args) {
        int[][] grid = {{8,3,6,5,3,6,7,2,9},
                {4,2,5,8,7,9,3,8,1},
                {7,9,1,2,1,4,6,5,4},
                {9,2,1,4,3,5,8,7,6},
                {3,5,4,7,6,8,2,1,9},
                {6,8,7,1,9,2,5,4,3},
                {5,7,6,9,8,1,4,3,2},
                {2,4,3,6,5,7,1,9,8},
                {8,1,9,3,2,4,7,6,5}};
        System.out.println(solution(grid));
    }

    static boolean solution(int[][] grid) {

        int n = 0;
        String str1 = "";
        String str2 = "";
        String str3 = "";

        String str4 = "";
        String str5 = "";

        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                str4 = str4 + grid[i][j];
                str5 = str5 + grid[j][i];
            }

            for (int k=0;k<str4.length();k++){
                if (str4.contains(String.valueOf(k+1)) && str4.contains(String.valueOf(k+1)) && str5.contains(String.valueOf(k+1))){
                    str4.replaceFirst(k+"","");
                    str5.replaceFirst(k+"","");

                }else return false;
            }
            str4 = "";
            str5 = "";
        }

        while (n<9){
            for (int i =0;i<3;i++){
                for (int j=0;j<3;j++){
                    str1 = str1 + grid[i+n][j];
                    str2 = str2 + grid[i+n][j+3];
                    str3 = str3 + grid[i+n][j+6];

                }
            }
            for (int i=0;i<str1.length();i++){
                if (str1.contains(String.valueOf(i+1)) && str2.contains(String.valueOf(i+1)) && str3.contains(String.valueOf(i+1))){
                    str1.replaceFirst(i+"","");
                    str2.replaceFirst(i+"","");
                    str3.replaceFirst(i+"","");

                }else return false;
            }
            str1 = "";
            str2 = "";
            str3 = "";
            n = n + 3;
        }

        return true;
    }
}
