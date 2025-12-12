package Coding_basic_training.AtoZ;

import java.util.ArrayList;
import java.util.Arrays;


public class A_3 {
    public static void main(String[] args) {

        int[] num_list = {2, 1, 6};
        int n = 1;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<n; i++){
            list.add(num_list[i]);
        }

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(result));





        //정수 리스트 num_list와 정수 n이 주어질 때,
        // num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 "리스트"를 return하도록
        // solution 함수를 완성해주세요.

        //Arrays.copyOfRange 를 사용하면 한줄로 처리가능
        //Arrays.copyOfRange 원본 배열의 특정 구간을 복사해서 새로운 배열을 반환

        // answer = Arrays.copyOfRange(num_list,0,n); <- num_list배열을 복사하는데 0번째부터 n번째까지 복사해서 answer에 정의한다.

    }
}
