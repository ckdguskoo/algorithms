package Coding_basic_training.day.day11;

import java.util.Arrays;

public class Day11_4 {
    public static void main(String[] args) {
        int start_num = 10;
        int end_num = 3;
        int[] answer = new int[start_num-end_num+1];
        int a = 0;

        for (int i = start_num; i >= end_num; i--) {
            answer[a] = i;
            a++;
        }

        System.out.println(Arrays.toString(answer));
    }


    //정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
}
