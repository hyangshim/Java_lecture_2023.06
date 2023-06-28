package ch11_api.sec04_string;

public class Ex09_Trim {
	public static void main(String[] args) {
		String oldStr ="\t 자바 프로그래밍 \t\r\n";
		String newStr = oldStr.trim();       // \t\r등등 제거해주는 기능
		
		System.out.println(newStr.length());
		System.out.println(newStr);
	}
	
	
	

}
