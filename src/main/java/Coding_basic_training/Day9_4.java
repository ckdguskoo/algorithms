package Coding_basic_training;

import java.util.Arrays;

public class Day9_4 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana";
        String[] arr1 = new String[my_string.length()];
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            arr1[i] = my_string.substring(i, my_string.length());
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].equals(is_suffix)) {
                answer = 1;
                break;
            }
        }


        //     if(my_string.endsWith(is_suffix)) {
        //            return 1;
        //        } else {
        //            return 0;
        //        }

        System.out.println(answer);


        // 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
        // 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
        // 문자열 my_string과 is_suffix가 주어질 때,
        // is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.


        //endsWith메서드가 있었음...
        //나는 단순히 전에풀었던 코드를 응용해서 if문만 붙였는데
    }
}
