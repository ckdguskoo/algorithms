package Coding_basic_training.day.day8;

public class Day8_4 {
    public static void main(String[] args) {

        String my_string = "rermgorpsam";
        int[][] queries = {
                {2,3},
                {0,7},
                {5,9},
                {6,10}
        };

        String result = "";
        String reverse = "";
        int a=0;
        int b=0;

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < 1; j++) {
                a = queries[i][j];
                b = queries[i][j+1];

                result = my_string.substring(a,b+1); // 일반 문자열

                StringBuffer sb = new StringBuffer(result); //스트링 버퍼생성
                reverse = sb.reverse().toString(); //뒤집은 문자열

                StringBuilder full = new StringBuilder(my_string);
                full.replace(a, b + 1, reverse);
                my_string = full.toString();
            }
        }
        System.out.println(my_string);

    }
}
/*
    솔직히 이번 문제가 좀어려워서 구글링을 많이 하면서 풀었던거 같다.
 */
