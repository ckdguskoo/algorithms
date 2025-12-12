package Coding_basic_training.day.day10;

public class Day10_3 {
    public static void main(String[] args) {
        String code = "programmers";
        int q = 1;
        int r = 0;
        String answer = "";

        for (int i = 0; i < code.length(); i++) {
            if (i%q==r) {
                answer = answer + code.charAt(i);
            }
        }

        System.out.println(answer);

        //두 정수 q, r과 문자열 code가 주어질 때,
        // code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를
        // 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
    }
}
