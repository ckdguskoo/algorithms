package Coding_basic_training.AtoZ.C;

public class C_6 {
    public static void main(String[] args) {
        String binomial = "43 + 12";
        String[] arr = binomial.split(" ");
        int answer = 0;

        switch (arr[1]) {
            case "+":
                answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                break;
            case "-":
                answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                break;
            case "*":
                answer = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
                break;
            case  "/":
                answer = Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]);
        }

        System.out.println(answer);


    }
}
