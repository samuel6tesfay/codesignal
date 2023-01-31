package codeSignal;

public class ElectionsWinners46 {
    public static void main(String[] args) {
        int[] votes = {2,3,5,2};
        System.out.println(solution(votes,3));
    }
    static int solution(int[] votes, int k) {
        int count = 0;
        int max = 0;
        for (int i=0;i<votes.length;i++){
            max = Math.max(max,votes[i]);
        }
        for (int i=0;i<votes.length;i++){
            if(votes[i]+k<=max){
                count++;
            }
        }
        return count;
    }
}
