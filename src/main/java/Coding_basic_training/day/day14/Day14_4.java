package Coding_basic_training.day.day14;

public class Day14_4 {
    public static void main(String[] args) {
        int[] numbers = {58, 44, 27, 10, 100};
        int n = 139;
        int answer = 0;
        for (int i = 0; answer <= n; i++) {
            answer = answer + numbers[i];
        }
        System.out.println(answer);




        //정수 배열 numbers와 정수 n이 매개변수로 주어집니다.
        //numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간
        // 이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
    }
}
