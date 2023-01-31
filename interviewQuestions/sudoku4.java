package codeSignal.interviewQuestions;

public class sudoku4 {
    public static void main(String[] args) {
        char[][] grid = {{'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
 {'5','.','.','.','.','.','.','9','.'},
 {'.','.','.','5','6','.','.','.','.'},
 {'4','.','3','.','.','.','.','.','1'},
 {'.','.','.','7','.','.','.','.','.'},
 {'.','.','.','5','.','.','.','.','.'},
 {'.','.','.','.','.','.','.','.','.'},
 {'.','.','.','.','.','.','.','.','.'}};
        System.out.println(solution(grid));
    }
   static boolean solution(char[][] grid) {
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

            System.out.println(str5);
            String str = str4;
            for (int m = 0 ; m<2;m++){
                for (int k=0;k<9;k++){
                    if (str.charAt(k)!='.'){

                        if (k!=0 && k!=8 && str.substring(k+1).contains(str.charAt(k)+"") || str.substring(0,k).contains(str.charAt(k)+"")){
                            System.out.println('0');
                            return false;
                        }
                        else if(k==0 && str.substring(k+1).contains(str.charAt(k)+"") ){
                            System.out.println('1');
                            return false;
                        }
                        else if (k==8 && str.substring(0,k).contains(str.charAt(k)+"") ) {
                            System.out.println('2');
                            return false;
                        }
                    }

                }
                str = str5;
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

            String str = str1;
            for (int m = 0 ; m<3;m++){
                for (int k=0;k<9;k++){
                    if (str.charAt(k)!='.'){

                        if (k!=0 && k!=8 && str.substring(k+1).contains(str.charAt(k)+"") || str.substring(0,k).contains(str.charAt(k)+"")){
                            System.out.println('0');
                            return false;
                        }
                        else if(k==0 && str.substring(k+1).contains(str.charAt(k)+"") ){
                            System.out.println('1');
                            return false;
                        }
                        else if (k==8 && str.substring(0,k).contains(str.charAt(k)+"") ) {
                            System.out.println('2');
                            return false;
                        }
                    }

                }
                if (m==0){
                    str =str2;
                }else {
                    str = str3;
                }
            }
            str1 = "";
            str2 = "";
            str3 = "";
            n = n + 3;
        }
        return true;
    }
}
