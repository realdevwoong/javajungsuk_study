package org.zerock.springex.javajungsuk.ch03;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = (long)a * b; // int*int는 int이기 때문에 long을 최소 하나는 붙여줘야한다.
        System.out.println(c);
    }
}
