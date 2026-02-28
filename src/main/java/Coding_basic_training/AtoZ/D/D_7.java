package Coding_basic_training.AtoZ.D;

import java.util.Arrays;

public class D_7 {
    public static void main(String[] args) {
        String[] strArr = {"a","bc","d","efg","hi"};

        int answer = 0;

        int[] lenArr = new int[30];
        for(int i = 0; i < strArr.length; i++) {
            lenArr[strArr[i].length()-1]++;
        }

        for(int num : lenArr) {
            if(answer < num) answer = num;
        }

        System.out.println(answer);



        //문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
    }
}
