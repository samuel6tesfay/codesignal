package codeSignal;

public class growingPlant38 {
    public static void main(String[] args) {
        System.out.println(solution(100,10,910));
    }

    static int solution(int upSpeed, int downSpeed, int desiredHeight) {
        int count = 0;
        int plantHight = 0;
        while(true){
            plantHight += upSpeed;
            count++;
            if(plantHight>=desiredHeight)return count;
            plantHight -= downSpeed;
        }

    }

}
