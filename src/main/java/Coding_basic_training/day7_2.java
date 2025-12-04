package Coding_basic_training;

import java.util.ArrayList;
import java.util.Arrays;

public class day7_2 {
    public static void main(String[] args) {
    int l = 5;
    int r = 555;

    ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            boolean ok = true;

            for(char c : s.toCharArray()){
                if (c!='0' && c!='5'){
                    ok = false;
                    break;
                }
            }
            if (ok){
                list.add(i);
            }
        }

        if (list.isEmpty()){
            list.add(-1);
        }

        Integer[] integers = list.stream().toArray(Integer[]::new);

        int[] arr = Arrays.stream(integers).mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));







        //정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서
        // 숫자 "0"과 "5"로만 이루어진 모든 정수를 *오름차순으로 저장한 배열*을 //리스트 이용해서 값들을 받고 배열로 변환
        // return 하는 solution 함수를 완성해 주세요.
        //만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
    }
}
