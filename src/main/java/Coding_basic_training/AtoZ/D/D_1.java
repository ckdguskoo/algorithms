package Coding_basic_training.AtoZ.D;

public class D_1 {
    public static void main(String[] args) {
        String myString = "abcdefghidj";
        String pat = "d";

        int idx = myString.lastIndexOf(pat);
        String answer = myString.substring(0,idx+pat.length());
        System.out.println(answer);

        //문자열 myString과 pat가 주어집니다.
        //myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
    }
}
