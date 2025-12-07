package Coding_basic_training;

import java.util.ArrayList;
import java.util.List;

public class Day7_3 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (arr.length>i){
            if (list.isEmpty()){
                list.add(arr[i]);
                i+=1;
            }
            else if (list.get(list.size()-1) < arr[i]) {
                list.add(arr[i]);
                i+=1;
            }else if (list.get(list.size()-1) >= arr[i]) {
                list.remove(list.size()-1);
            }
        }
        int[] stk = list.stream().mapToInt(Integer::intValue).toArray();



        //입력값 〉 [5, 3, 4, 1, 2]
        //기댓값 〉 [1, 2]





        //정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
        //변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.

        //만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.

        //stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.

        //stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.

        //위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.


        /* for문을 고집해서 쓰는거보다 while문도 유동적으로 사용해야겠다.
        너무 for문에 집착하다 보니 문제를 어렵게 생각하고 있었다...
         */
    }
}
