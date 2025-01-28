package org.zerock.springex.javajungsuk.ch03;

public class OperatorEx2 {
    public static void main(String[] args) {
// 다른 수식에 포함되거나 메서드의 매개변수로 사용될 때는 전위형과 후위형이 다르다.
        int i = 5, j=0;
        j = i++;
        System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);
        i = 5;
        j = 0;
        j = ++i;
        System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
    }
}

