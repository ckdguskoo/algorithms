package Coding_basic_training;

public class A_2 {
    public static void main(String[] args) {

        String my_strint = "ProgrammerS123";
        int n =11;

        String str1="";

        for (int i = 0; i < n; i++) {
            char a = my_strint.charAt(i);
            str1+=a;

        }
        System.out.println(str1);


        //문자열 my_string과 정수 n이 매개변수로 주어질 때,
        // my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.

        //자바 서브 스트링을 활용해서 문제를 풀었으면 더 간편하게 풀었을거같다.
    }
}
