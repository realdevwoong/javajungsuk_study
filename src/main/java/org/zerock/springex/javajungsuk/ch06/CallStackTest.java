package org.zerock.springex.javajungsuk.ch06;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }
    static void firstMethod(){
        secondMethod();
    }
    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}
