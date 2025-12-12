package Coding_basic_training.day.day11;

import java.util.Arrays;

public class Day11_2 {
    public static void main(String[] args) {
        int k =5;
        int n = 15;
        int[] answer = new int[n/k];

        int a = 0;

        for (int i = k; i<=n; i+=k) {

            answer[a] = i;
            a++;
        }
        System.out.println(Arrays.toString(answer));





        //정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서
        // k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    }
}
