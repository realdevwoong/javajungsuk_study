package org.zerock.springex.javajungsuk.ch02;
import java.util.*;
public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용: " + input);
        System.out.printf("num= %d%n", num);
    }
}
