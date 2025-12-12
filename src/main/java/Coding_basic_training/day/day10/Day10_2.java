package Coding_basic_training.day.day10;

public class Day10_2 {
    public static void main(String[] args) {

        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;
        String answer = "";

        String[] arr = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            arr[i] = my_string.charAt(i) + "";
        }

        for (int i = c-1; i < arr.length; i+=m) {
            answer = answer + arr[i];
        }

        System.out.println(answer);





        //문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때
        //왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.

        //첫번째 for문에 조건을 수정해서 바로 answer에 값을 집어넣어서 리턴해 더 간단하게 만들수 있었을거같다.
    }
}
