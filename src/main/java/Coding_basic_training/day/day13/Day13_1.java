package Coding_basic_training.day.day13;

import java.util.Arrays;

public class Day13_1 {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 2;
        int[] answer = new int[num_list.length-n+1];
        int a = 0;
        for (int i = n-1; i < num_list.length ; i++) {
            answer[a] =  num_list[i];
            a++;
        }

        System.out.println(Arrays.toString(answer));


        //정수 리스트 num_list와 정수 n이 주어질 때,
        //n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    }
}
