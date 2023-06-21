package ch02;

import java.util.Scanner;

public class Ex04_IO {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력하세요> ");
		String inputText = scan.nextLine();    // Enter를 칠 때 까지의 문자열을 읽음
		System.out.println(inputText);
		
		System.out.println("타입을 입력하세요>");
		String type = scan.nextLine();
		System.out.print(type + "를 입력하세요> ");      // 정수, 실수
		String numStr = scan.nextLine();

		if (type.equals("정수")) {
			int num = Integer.parseInt(numStr);
			System.out.println(num);
		} else if (type.equals("실수")) {
			double num = Double.parseDouble(numStr);
			System.out.println(num);
		} else {

			System.out.println("정수 또는 실수를 입력하세요.");
		}
	}

}
