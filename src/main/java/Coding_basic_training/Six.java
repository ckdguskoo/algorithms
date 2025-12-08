package Coding_basic_training;

public class Six {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "ban";

        int answer = 1;

        for (int i = 0; i < is_prefix.length(); i++) {
            if (my_string.length() < is_prefix.length()) {
                answer = 0;
                break;
            }
            char a = my_string.charAt(i);
            char b = is_prefix.charAt(i);

            if (!(a ==b)) {
                answer = 0;
                break;
            }
        }

        System.out.println(answer);





        //어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
        // 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
        //문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을,
        // 아니면 0을 return 하는 solution 함수를 작성해 주세요.

        //startsWith사용으로 접두사를 바로 확인할수 있음...
        //if (my_string.startsWith(is_prefix))
    }
}
