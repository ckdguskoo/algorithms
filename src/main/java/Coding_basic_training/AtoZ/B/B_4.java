package Coding_basic_training.AtoZ.B;

public class B_4 {
    public static void main(String[] args) {
        String n_str = "0000000001";
        String answer = "";

        StringBuffer sb = new StringBuffer(n_str);

        for (int i = 0; i <n_str.length() ; i++) {
            if (sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }
        }

        System.out.println(sb);
        //정수로 이루어진 문자열 n_str이 주어질 때,
        //n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
    }
}
