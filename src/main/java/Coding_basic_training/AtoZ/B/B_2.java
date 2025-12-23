package Coding_basic_training.AtoZ.B;

import java.util.Arrays;

public class B_2 {
    public static void main(String[] args) {
        int[] arr ={293, 1000, 395, 678, 94};
        int[] delete_list ={94, 777, 104, 1000, 1, 12};
        int[] answer = {};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    arr[i]=0;
                }
            }
        }

        answer = Arrays.stream(arr)
                        .filter(num->num !=0).toArray();
        System.out.println(Arrays.toString(answer));



        //정수 배열 arr과 delete_list가 있습니다.
        //arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
    }
}
