package Coding_basic_training.AtoZ.A;

import java.util.ArrayList;
import java.util.Arrays;

public class A_5 {
    public static void main(String[] args) {
        int start_num = 1;
        int end_num = 20;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = start_num; i <= end_num ; i++) {
            list.add(i);
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(answer));






        //정수 start_num와 end_num가 주어질 때,
        // start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록
        // solution 함수를 완성해주세요.


        //맨 처음 answer의 길이를 지정해주고 값을 넣어주는 로직을 만들었으면 더 효율적일거같다.
        //지금 방식은 리스트로 받은후 다시 배열로 변환을하기때문에 과정이 번거롭게 느껴진다.
        //        int[] answer = new int[end - start+1];
        //        for(int i =0; i<= end - start; i++) {
        //            answer[i] = start + i;
        //        }
        //        return answer;
    }
}
