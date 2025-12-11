package Coding_basic_training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_11 {
    public static void main(String[] args) {

        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 4;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_list.length; i+=n) {
            list.add(num_list[i]);
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();



        //정수 리스트 num_list와 정수 n이 주어질 때,
        // num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을
        // 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    }
}
