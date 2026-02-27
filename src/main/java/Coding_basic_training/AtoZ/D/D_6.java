package Coding_basic_training.AtoZ.D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D_6 {
    public static void main(String[] args) {
        int[] arr = {58, 172, 746, 89};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int a = 1;
        while (a < list.size()) {
            a *= 2;
        }

        for (int i = list.size(); i < a; i++) {
            list.add(0);
        }

        int[] answer = list.stream().mapToInt(x->x).toArray();
        System.out.println(Arrays.toString(answer));



        //정수 배열 arr이 매개변수로 주어집니다.
        //arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
        //arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
    }
}
