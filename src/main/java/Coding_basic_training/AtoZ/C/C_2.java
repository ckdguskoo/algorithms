package Coding_basic_training.AtoZ.C;

import java.util.ArrayList;
import java.util.List;

public class C_2 {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";
        List<Integer> list = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < myString.length(); i++) {

            if (myString.charAt(i) != 'x') {
                a +=1;
            }else  {
                list.add(a);
                a = 0;
            }

        }
        list.add(a);

        int[] answer = list.stream().mapToInt(x->x).toArray();



        //문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때
        //나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    }
}
