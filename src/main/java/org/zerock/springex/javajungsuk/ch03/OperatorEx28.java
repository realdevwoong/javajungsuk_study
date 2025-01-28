package org.zerock.springex.javajungsuk.ch03;


import static java.lang.Integer.toBinaryString;

public class OperatorEx28 {
    public static void main(String[] args) {
        int x = 0xAB, y= 0xF;
        System.out.printf("x=%#X \t\t%s%n", x, toBinaryString(x));
        System.out.printf("y=%#X \t\t%s%n", y, toBinaryString(y));
        System.out.printf("%#X | %#X = %#X\t %s%n", x, y, x|y, toBinaryString(x|y));
        System.out.printf("%#X & %#X = %#X\t %s%n", x, y, x&y, toBinaryString(x&y));
        System.out.printf("%#X ^ %#X = %#X\t %s%n", x, y, x^y, toBinaryString(x^y));
        System.out.printf("%#X ^ %#X ^ %#X = %X %s%n", x, y, y, x^y^y,toBinaryString(x^y^y));
        //x=0XAB 		10101011
        //y=0XF 		1111
        //0XAB | 0XF = 0XAF	 10101111
        //0XAB & 0XF = 0XB	 1011
        //0XAB ^ 0XF = 0XA4	 10100100
        //0XAB ^ 0XF ^ 0XF = AB 10101011
    }
}
