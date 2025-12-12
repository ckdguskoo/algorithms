package Coding_basic_training.day.day8;

public class Day8_1 {
    public static void main(String[] args) {
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = false;
        boolean x4 = false;

        boolean b1 = false;
        boolean b2 = false;
        boolean answer = false;

        if (x1 || x2){
            b1 = true;
        }
        if (x3 || x4){
            b2 = true;
        }
        if (b1 && b2) {
            answer = true;
        }

        System.out.println(answer);


        //boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
        //
        //(x1 ∨ x2) ∧ (x3 ∨ x4)

        //boolean answer = (x1||x2)&&(x3||x4);
        /*내 코드를 압축하면 위코드처럼 쓸수 있다
        머리속으로는 한줄로 만들수 있을거같았지만 조금 생각이 부족했던거같다.
         */

    }
}
