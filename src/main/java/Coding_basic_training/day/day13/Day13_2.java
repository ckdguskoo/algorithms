package Coding_basic_training.day.day13;

import java.util.ArrayList;
import java.util.List;

public class Day13_2 {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        List<Integer> list = new ArrayList<>();

        for (int i = n; i < num_list.length ; i++) {
            list.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();



        //정수 리스트 num_list와 정수 n이 주어질 때,
        // num_list를 n 번째 원소 이후의 원소들과
        // n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
    }
}
