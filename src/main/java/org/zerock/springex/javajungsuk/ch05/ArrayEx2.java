package org.zerock.springex.javajungsuk.ch05;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[]{100,95,80,70,60};
        char[] chArr = {'a','b','c','d'};
        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random()*10) +1;
        }
        for(int i = 0; i < iArr3.length; i++) {
            System.out.print(iArr1[i] + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
        //1,2,3,4,5,
        //[7, 10, 4, 2, 4, 5, 5, 10, 7, 4]
        //[100, 95, 80, 70, 60]
        //[a, b, c, d]
        //[I@4cc77c2e]
        //abcd
        //why? char[] and int[] result are different?
        // char[] (like chArr): Java automatically converts it to a readable string when printed because it is a sequence of characters.
    }
}
