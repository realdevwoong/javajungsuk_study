package org.zerock.springex.javajungsuk.ch04;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;
        System.out.println("숫자를 하나 입력 하세요.");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);
        if(input==0){
            System.out.println("입력하신 숫자는 0입니다.");
        }
        if(input!=0){
            System.out.println("입력하신 숫자는 0이 아닙니다.");//괄호를 하면 3번째 부터 출력된다.
            System.out.printf("입력하신 숫자는 %d입니다.", input);
        }
    }
}
