package org.zerock.springex.javajungsuk.ch03;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';
        //char c2 = c1 + 1; //오류 생김 int형으로 변환
        char c2 = 'a' + 1; //리터럴 끼리 연산 오류 안생김
        System.out.println(c2);
    }
}
