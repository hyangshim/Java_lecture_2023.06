package ch10_exception;

public class EX03_NumberFormat {
	public static void main(String[] args) {
		String str = "100원";
	
		
		//System.out.println(value); 에러남
		// 해결(문자열 API 또는 정규표현식을 사용하여 의외의 문자는 다 삭제
		
		int value =Integer.parseInt(str.replace("원",""));
		System.out.println(value);
		
	}

}
