package Coding_basic_training.AtoZ.C;

public class C_10 {
    public static void main(String[] args) {
        String myString = "abstract algebra";
        myString = myString.toLowerCase();

        myString = myString.replaceAll("a", "A");

        System.out.println(myString);
    }
}
