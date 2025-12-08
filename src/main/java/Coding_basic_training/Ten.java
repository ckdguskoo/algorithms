package Coding_basic_training;

public class Ten {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "x";
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == alp.charAt(0)) {
                answer = answer + my_string.toUpperCase().charAt(i);
            }else {
                answer = answer + my_string.charAt(i);
            }
        }

        System.out.println(answer);



        //영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때,
        // my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
        //        String a = alp.toUpperCase();
        //        return my_string.replaceAll( alp, a);
        // String 변수 a에 alp를 대문자로 치환해서 담아준후
        // replaceAll을 사용하여 mystring에 alp와 같은 문자를 a로 바꿈 
    }
}
