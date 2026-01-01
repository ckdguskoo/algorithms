package Coding_basic_training.AtoZ.B;

public class B_9 {
    public static void main(String[] args) {
        String num_str = "1000000";
        int answer =0;

        for(int i=0;i<num_str.length();i++){
            answer+=num_str.charAt(i)-'0';
        }

        System.out.println(answer);


        //한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
        //ASCII 값에 '0'은 48이기 떄문에 빼서 숫자로 변환
    }
}
