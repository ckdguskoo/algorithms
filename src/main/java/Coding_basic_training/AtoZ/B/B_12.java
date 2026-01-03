package Coding_basic_training.AtoZ.B;

import java.util.Arrays;

public class B_12 {
    public static void main(String[] args) {
        int[] arr = {444, 555, 666, 777};
        int n =  100;
        int a = arr.length;

        if (a%2==0){
            for (int i = 0; i < a; i++) {
                if (i%2==1){
                    arr[i] = arr[i]+n;
                }
            }

        }else {
            for (int i = 0; i < a; i++) {
                if (i%2==0){
                    arr[i] = arr[i]+n;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


        //정수 배열 arr과 정수 n이 매개변수로 주어집니다.
        // arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
        // arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을
        // return 하는 solution 함수를 작성해 주세요.

    }
}
