package codeSignal;

public class FileNaming57 {
    public static void main(String[] args) {
        String[] str = {"a(1)",
                "a(6)",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a"};
//        System.out.println(solution(str));
        String[] str2 = solution(str);
        for (int i = 0 ;i<str2.length;i++){
            System.out.println(str2[i]);
        }


    }

    static boolean is_valid=false;
    static String[] solution(String[] names) {
//        String[] str = re(names);
//        for (int i = 0 ;i<str.length;i++){
//            System.out.println(str[i]);
//        }
        return re(names);
    }
    static String[] re(String[] names){
        String[] str = new String[names.length];
        int count=0;
        for (int i = 0 ; i < names.length;i++){
            is_valid = true;
            if (i== 0)str[i] = names[i];
            for (int j = 0 ; j < i;j++){
                if (names[i].equals(names[j]) || names[i].equals(str[j])){
                    is_valid = false;
                    count++;
                }
                if (count!=0 && j == i - 1){
                    str[i] = names[i]+"("+count+")";
                    count = 0;
                }else if(count == 0 && j == i - 1){
                    str[i] = names[i];
                }

            }
        }


        if (!is_valid)   return re(str);
        else return str;
//        return str;
    }
}
