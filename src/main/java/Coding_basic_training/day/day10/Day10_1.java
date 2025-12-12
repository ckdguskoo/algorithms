package Coding_basic_training.day.day10;

public class Day10_1 {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        String answer = "";

        String substring = my_string.substring(s, e+1);
        StringBuffer sb2 = new StringBuffer(my_string);
        StringBuffer sb = new StringBuffer(substring);

        sb.reverse();
        sb2.replace(s,e+1,sb.toString());

        answer = sb2.toString();
        System.out.println(answer);






        //문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서
        // 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
    }
}
