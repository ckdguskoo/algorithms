package Coding_basic_training.day.day14;

import java.util.Arrays;

public class Day14_3 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        Boolean[] finished = {true, false, true, false};

        int a =0;
        for (int i = 0; i < finished.length; i++) {
            if (!(finished[i])) {
                a+=1;
            }
        }
        String[] answer = new String[a];
        a= 0;

        for (int i = 0; i < todo_list.length; i++) {
            if (!(finished[i])) {
                answer[a] = todo_list[i];
                a++;
            }
        }

        System.out.println(Arrays.toString(answer));


        //오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때,
        //todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
    }
}
