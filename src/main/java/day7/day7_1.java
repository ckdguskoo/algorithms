package day7;

import java.util.Arrays;

public class day7_1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries =
                {{0,4,1},
                {0,3,2},
                {0,3,3}};

        int a;
        int b;
        int c;

        for (int i = 0; i < queries.length; i++) {
            a = queries[i][0];
            b = queries[i][1];
            c = queries[i][2];

            for (int j = a; j<=b; j++){
                if (j%c==0){
                    arr[j] = arr[j]+1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}

//쿼리s에 0,1인덱스를 변수로 만들어서
// 각각 arr의 범위를 지정해주고
// 그 범위 내에 쿼리에 2번째 값이랑 배수인게 있으면
// 그 배수를 +1