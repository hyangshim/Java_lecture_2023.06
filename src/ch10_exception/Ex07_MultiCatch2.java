package ch10_exception;

public class Ex07_MultiCatch2 {
	public static void main(String[] args) {
		String str = null;
		int value =0;

		try {
			str =args[0];
			value =Integer.parseInt(str);
		} catch (ArrayIndexOutOfBoundsException |NumberFormatException e) {
			e.printStackTrace();
			System.out.println("사용법 : 매개변수가 없거나 잘못된 숫자 형식입니다.");
		}
		System.out.println(value);
	}

}
