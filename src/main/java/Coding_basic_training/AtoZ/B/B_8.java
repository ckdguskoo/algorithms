package Coding_basic_training.AtoZ.B;

import java.util.Arrays;

public class B_8 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] arr = Arrays.stream(num_list).sorted().toArray();
        int[] answer = new int[num_list.length-5];

        for (int i = 5; i < arr.length; i++) {
            answer[i-5] = arr[i];
        }
        System.out.println(Arrays.toString(answer));



        //정수로 이루어진 리스트 num_list가 주어집니다.
        // num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

        //Arrays.stream(numList).sorted().skip(5).toArray();
        //skip을 사용해서 앞에 5개의 수를 제외 할수 있음
    }
}
