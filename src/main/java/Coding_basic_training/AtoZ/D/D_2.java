package Coding_basic_training.AtoZ.D;

public class D_2 {
    public static void main(String[] args) {
        String myString = "aaaaabb";
        String pat = "abb";
        int answer = 0;

        for (int i = 0; i <= myString.length()-pat.length() ; i++) {
            String a = myString.substring(i,pat.length()+i);
            System.out.println(a);
            if (a.equals(pat)) {
                answer++;
            }
        }

        System.out.println(answer);

        



        //문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
    }
}
