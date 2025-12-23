package Coding_basic_training.AtoZ.A;

public class A_7 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String answer = "";

        String[] str1 = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            str1[i] = my_string.substring(i, i + 1);
        }

        for (int i = 0; i < index_list.length; i++) {
            answer = answer + str1[index_list[i]];
        }
        System.out.println(answer);


        //문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
        // my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는
        // solution 함수를 작성해 주세요.
    }
}
