package Coding_basic_training.AtoZ.A;

public class A_13 {
    public static void main(String[] args) {
        String myString = "abcdevwxyz";
        String answer = "";

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i)<108 ) {
                answer += "l";
                continue;
            }
            answer = answer + myString.charAt(i);
        }

        System.out.println(answer);
    }
}
