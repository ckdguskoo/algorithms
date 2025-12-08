package Coding_basic_training;

public class Day8_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 5;
        int d = 5;
        int answer = 0;

        if (a == b && b == c && c == d) { //네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
            answer = 1111*a;
        }

        else if (a==b && a==c && !(a==d) || a==b && a==d && !(a==c) || a==c && a==d && !(a==b) || b==c && b==d &&!(b==a) ){
            //세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
            if (a==b && a==c && !(a==d)){
                answer = (int) Math.pow((10* a + d),2);
            }else if (a==b && a==d && !(a==c)){
                answer = (int) Math.pow((10* a + c),2);
            }
            else if (a==c && a==d && !(a==b)){
                answer = (int) Math.pow((10* a + b),2);
            }
            else if (b==c && b==d &&!(b==a)){
                answer = (int) Math.pow((10* b + a),2);
            }
        }

        else if (a==b&&c==d || a==c && b==d || a==d && b==c) { //주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
            if (a==b && c==d) {
                answer = Math.abs((a+c)*(a-c));
            }
            else if (a==c && b==d) {
                answer = Math.abs((a + d) * (a - d));
            }
            else if (a==d && b==c) {
                answer = Math.abs((a+b) * (a-b));
            }
        }

        else  if (a==b || a==c || a==d || b == c || b==d || c==d) { //어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
            if (a==b){
                answer = c*d;
            }else if (a==c){
                answer = b*d;
            }else if (a==d){
                answer = b*c;
            }else if (b==c){
                answer = a*d;
            }else if (b==d){
                answer = a*c;
            }else if (c==d){
                answer = a*b;
            }
        }

        else if (!(a ==b) && !(b ==c) && !(c ==d)) { //네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
            for (int i = 1; i < 6; i++) {
                if (a==i){
                    answer = a;
                    break;
                }
                if (b==i){
                    answer = b;
                    break;
                }
                if (c==i){
                    answer = c;
                    break;
                }
                if (d==i){
                    answer = d;
                    break;
                }
            }
        }

        System.out.println(answer);





        //1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
        //
        //네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
        //세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
        //주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
        //어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
        //네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
        //네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
        //제한사항
        //a, b, c, d는 1 이상 6 이하의 정수입니다.


        /*
        문제 진짜 너무 귀찮게 풀어야 했던거같다....
        정렬로 케이스를 분류한 코드를 봤는데 뭔가 대단하다는 생각이 들었다.
        첫번째 케이스 까지는 이해했는데 그 다음부터는 생각을 깊게 해야 보였다..
         */
    }
}
