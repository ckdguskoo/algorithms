package Coding_basic_training.AtoZ.C;

import java.util.Arrays;

public class C_14 {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));


        //정수 n이 매개변수로 주어질 때,
        // 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
        //arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.
    }
}
