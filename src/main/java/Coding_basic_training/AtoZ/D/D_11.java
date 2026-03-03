package Coding_basic_training.AtoZ.D;

import java.math.BigInteger;

public class D_11 {
    public static void main(String[] args) {
        String a = "18446744073709551615";
        String b = "287346502836570928366";

        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);

        BigInteger a2 = a1.add(b1);

        String answer = String.valueOf(a2);

        System.out.println(answer);

        //0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
    }
}
