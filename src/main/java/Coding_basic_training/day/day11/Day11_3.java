package Coding_basic_training.day.day11;

import java.util.Arrays;

public class Day11_3 {
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        String answer = "";

        int a = 0;
        Arrays.sort(indices);
        System.out.println(Arrays.toString(indices));

        StringBuffer sb = new StringBuffer(my_string);

        for (int i = 0; i < indices.length ; i++) {
            sb.deleteCharAt(indices[i]-a);
            System.out.println(sb);
            a++;
        }


        System.out.println(sb);





        //문자열 my_string과 정수 배열 indices가 주어질 때,
        // my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
    }
}
