package ch10_exception;

public class EX01_Nullpointer {
	public static void main(String[] args) {
		String str =null;
		str = "Java";
		
		//System.out.println(str.length());
		
		//해결
		if (str !=null)
			System.out.println(str.length());
	}
}
