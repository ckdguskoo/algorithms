package Coding_basic_training.AtoZ.C;

public class C_13 {
    public static void main(String[] args) {
        int[][] arr = {
                {19, 498, 258, 587},
                {63, 93, 7, 754},
                {258, 7, 1000, 723},
                {587, 754, 723, 81}
        };
        int answer = 0;
        boolean result = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int a = arr[i][j];
                int b = arr[j][i];
                if (a == b) {
                    continue;
                }
                else {
                    result = false;
                    break;
                }
            }
        }

        if (result) {
            answer = 1;
        }
        else  {
            answer = 0;
        }
        System.out.println(answer);



        //n × n 크기의 이차원 배열 arr이 매개변수로 주어질 때,
        //arr이 다음을 만족하면 1을 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
        //0 ≤ i, j < n인 정수 i, j에 대하여 arr[i][j] = arr[j][i]
    }
}
