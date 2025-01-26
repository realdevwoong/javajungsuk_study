package org.zerock.springex.javajungsuk.ch02;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;
        System.out.printf("%c=%d(%#X)%n",ch, code,code);
        //16진수로
    }
}
