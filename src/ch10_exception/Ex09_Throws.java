package ch10_exception;

public class Ex09_Throws {
	public static void main(String[] args)  throws Exception{
		findClass();
	}
	static void findClass() throws ClassNotFoundException {
			Class clazz = Class.forName("java.lang.String1");
			System.out.println(clazz.getName());
	}
}
