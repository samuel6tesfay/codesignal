package codeSignal.interviewQuestions;

public class isCryptSolution5 {
    public static void main(String[] args) {
       String[] crypt ={"TEN",
                "TWO",
                "ONE"};
        char[][] solution = {{'O','1'},
         {'T','0'},
         {'W','9'},
         {'E','5'},
         {'N','4'}};


        System.out.println(solution(crypt,solution));

    }

    static boolean solution(String[] crypt, char[][] solution) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        String cry = crypt[0];
        int tempnum = 0;
        int m = 0;
        while (m<3){
            tempnum = 0;
            for (int i=0;i<cry.length();i++){
                char c = cry.charAt(i);
                int k = 0;
                for (char[] solu:solution){
                    if (c == solu[0]){
                        tempnum = (tempnum*10)+Integer.parseInt(solu[1]+"");
                    }
                    if (k==0 && tempnum == 0){
                        return false;
                    }
                    k++;
                }
            }
            if (m==0){
                num1 = tempnum;
                cry = crypt[1];
            }else if(m==1){
                num2 = tempnum;
                cry = crypt[2];
            }else {
                num3 = tempnum;
            }
            m++;
        }
        return num1+num2==num3;
    }
}
