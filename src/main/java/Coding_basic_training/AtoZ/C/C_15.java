package Coding_basic_training.AtoZ.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_15 {
    public static void main(String[] args) {
        String myString = "xabcxxdefxghi";

        String[] splitArr = myString.split("x");
        System.out.println(Arrays.toString(splitArr));
        List<String> list = new ArrayList<>();

        for (String s : splitArr) {
            if (!s.isEmpty()) {   // 빈 문자열 제거
                list.add(s);
            }
        }

        list.sort(String::compareTo);  // 사전순 정렬

        String[] answer = list.toArray(new String[0]);

        System.out.println(Arrays.toString(answer));


        //문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
        //단, 빈 문자열은 반환할 배열에 넣지 않습니다.
    }
}
