package Coding_basic_training.day.day12;

import java.util.ArrayList;
import java.util.List;

public class Day12_4 {
    public static void main(String[] args) {
        int[] arr ={0, 1, 2, 3, 4, 5, 6, 7};
        int[] query = {4, 1, 2};
        List<Integer> list = new ArrayList<>();

        for(int i : arr){
            list.add(i);
        }

        for (int i = 0; i <query.length ; i++) {
            if (i%2==0){
                list.subList(query[i]+1, list.size()).clear();
            }else if (i%2==1){
                list.subList(0,query[i]).clear();
            }
        }

        int[] answer = list.stream().mapToInt(x->x).toArray();

        System.out.println(list);



        //정수 배열 arr와 query가 주어집니다.
        //
        //query를 순회하면서 다음 작업을 반복합니다.
        //
        //짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
        //홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
        //위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.


        //새벽에 풀어서 그런가 쉽게 갈수있는데 조금 멍청하게 풀어간거같다.
        //정신차리고 다시 풀어보니 풀만했다.
    }
}
