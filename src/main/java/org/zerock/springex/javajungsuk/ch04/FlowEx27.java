package org.zerock.springex.javajungsuk.ch04;

import java.util.*;

class FlowEx27 {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true;
		System.out.println("합계를 구할 숫자를 입력하세요.(끌내려면 0을 입력)");
		while (flag) {
			System.out.print(">>");
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			if(num!=0) {
				sum += num; // num이 0이 아니면, sum에 더한다.
			} else {
				flag = false;   // num이 0이면, flag의 값을 false로 변경.
			}
		}
		System.out.println("합계:"+ sum);
	}
}