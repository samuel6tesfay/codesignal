package codeSignal;

import java.util.ArrayList;

public class BoxBlur23 {

    public static void main(String[] args) {
        int[][] in = {{1,1,1},{1,7,1},{1,1,1}};
        System.out.println(solution(in));
    }

    static int[][] solution(int[][] image) {

        int[][] re = new int[image.length - 2][image[0].length-2];
        int sum = 0;
        for (int i = 0 ; i < image.length - 2;i++){
            for(int j = 0; j < image[i].length - 2;j++){
                sum = image[i][j] + image[i][j+1] + image[i][j+2] +
                        image[i+1][j] + image[i+1][j+1] + image[i+1][j+2] +
                        image[i+2][j] + image[i+2][j+1] + image[i+2][j+2];

                re[i][j] = sum/9;
                sum = 0;

            }
        }
        System.out.println(re[0][0]);
        return re;

    }
}
