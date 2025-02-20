package org.zerock.springex.javajungsuk.ch03;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
        System.out.printf("\"abc\" == \"abc\" ? %b%n", str1 == "abc");
        System.out.printf("\"abc\" == \"abc\" ? %b%n", str2 == "abc"); //내용은 같지만 서로 다른 객체
        System.out.printf("str1.equals(str2): %b%n", str1.equals("abc"));
        System.out.printf("str1.equals(str2): %b%n", str2.equals("abc"));
        System.out.printf("str1.equals(str2): %b%n", str2.equals("ABC"));
        System.out.printf("str1.equals(str2): %b%n", str2.equalsIgnoreCase("ABC"));
    }
}
