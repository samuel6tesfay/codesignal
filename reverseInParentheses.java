package codeSignal;

import java.util.Stack;

public class reverseInParentheses {
    public static void main(String[] args) {

        String s = "(abc)d(efg)";
        System.out.println(solution(s));
        System.out.println(solution2(s));
    }

    static String solution(String inputString) {

        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack();
        for(int i = 0 ; i < inputString.length();i++){
            if(inputString.charAt(i) == '('){
                s.push(i);
            }else if(inputString.charAt(i) == ')'){
                StringBuilder sb2 = new StringBuilder();
                if(s.lastElement() !=0){
                    sb2.append(inputString.substring(s.lastElement()+1,i)).reverse();
                    inputString = inputString.substring(0,s.lastElement()) + sb2.toString() + inputString.substring(i+1);
                    i=i-2;
                }else{
                    if(i == inputString.length()-1){
                        inputString = inputString.substring(1,inputString.length()-1);
                        inputString = sb.append(inputString).reverse().toString();
                    }else {
                        sb2.append(inputString.substring(1,i)).reverse();
                        inputString = sb2.toString() + inputString.substring(i+1);
                        i = i - 2;
                    }

                }

                s.pop();
            }
        }
        return inputString;
    }

    static String solution2(String inputString){

        StringBuilder sb = new StringBuilder(inputString);

        System.out.println(sb);
        int start;
        int end;
        while (sb.indexOf("(")!=-1){
            start = sb.lastIndexOf("(");
            end = sb.indexOf(")",start);
            sb.replace(start,end+1,new StringBuilder(sb.substring(start+1,end)).reverse().toString());
        }



        return sb.toString();
    }

}

