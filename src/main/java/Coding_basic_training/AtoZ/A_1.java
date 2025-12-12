package Coding_basic_training.AtoZ;

public class A_1 {
    public static void main(String[] args) {
        int[] arr = {13, 22, 53, 24, 15, 6};
        int answer = 0;

        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                answer = i;
                result = true;
                break;
            }

        }
        if (!result){
            answer = -1;
        }
        System.out.println(answer);




    }
    //정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.

    //좀더 간결하게 코드를 줄일수있었을거같다.
}
