package codeSignal;

import builtIn.String;

public class almostIncreasingSequence {

    public static void main(String[] args) {

        int[] s = {10,2,3,4};
        int[] x = {1, 2, 3, 4, 3, 6};
        int[] y = {1,3,2};
        int[] z = {1,2,1,2};
        int[] g = {1, 3, 2, 1};


        System.out.println(solution(s));
        System.out.println(solution(x));
        System.out.println(solution(y));
        System.out.println(solution(z));
        System.out.println(solution(g));

    }

    static boolean solution(int[] sequence) {

        int removex = 0;
        for(int i = 0 ; i < sequence.length-1 ; i++){
            if(sequence[i] > sequence[i+1] || sequence[i] == sequence[i+1]){
                if(i == 0){
                    removex = removex + 1;
                    System.out.println(removex);

                }else if(i < sequence.length - 2){
                     if(sequence[i-1] > sequence[i+1] || sequence[i-1] == sequence[i+1]){
                        if (sequence[i] > sequence[i+2] || sequence[i] == sequence[i+2]){
                            return false;
                        }else {
                            removex = removex + 1;
                        }
                    }else {
                         removex = removex + 1;
                     }
                }else {
                    removex = removex + 1;
                }
            }


            if(removex > 1){
                return false;
            }

        }

        return true;

//        Stack<Integer> stack = new Stack();
//        stack.push(sequence[0]);
//        int remove = 0;
//        for(int i = 1 ; i < sequence.length ; i++){
////            System.out.println(sequence[i]);
////            System.out.println(stack.lastElement());
//            if(sequence[i] < stack.lastElement() || sequence[i] == stack.lastElement()){
//                if(sequence[i-1] < stack.lastElement() || sequence[i-1] == stack.lastElement()){
//                    remove = remove + 1;
//                    if (remove >= 2) return false;
//                }
//                remove = remove + 1;
//                stack.push(sequence[i]);
//                if (remove >= 2) return false;
//            }else{
//                stack.push(sequence[i]);
//            }
//        }
//
//        System.out.println(stack);
//
//        return true;
    }

    public static class he {

        public static void main(String[] args) {
            System.out.println("x");
        }
    }
}
