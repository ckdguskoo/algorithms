package Coding_basic_training.day.day11;

public class Day11_5 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0};
        int idx = 3;
        int answer = 0;

        for (int i = idx ; i < arr.length; i++) {
            if (arr[i]==1){
                answer = i;
                break;
            }
            else {
                answer = -1;
            }
        }

        System.out.println(answer);
    }
    //정수 배열 arr가 주어집니다. 이때 arr의 원소는 1 또는 0입니다. 정수 idx가 주어졌을 때,
    // idx보다 크거나 같은 배열의 값이 1인 가장 작은 인덱스를 찾아서 반환하는 solution 함수를 완성해 주세요. //문제오류
    //단, 만약 그러한 인덱스가 없다면 -1을 반환합니다.
}
