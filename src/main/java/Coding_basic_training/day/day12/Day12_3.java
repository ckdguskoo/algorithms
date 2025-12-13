package Coding_basic_training.day.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day12_3 {
    public static void main(String[] args) {
        int[] arr ={1,1,1};

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        int a =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==2){
                list.add(i);
            }
        }
        if (!(list.size()==0)){
            for (int i = list.get(0); i <= list.get(list.size()-1); i++) {
                list1.add(arr[i]);
                a++;
            }
        }else {
            list1.add(-1);
        }

        int[] answer = list1.stream().mapToInt(x->x).toArray();

        System.out.println(Arrays.toString(answer));




        //정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
        //단, arr에 2가 없는 경우 [-1]을 return 합니다.
    }
}
