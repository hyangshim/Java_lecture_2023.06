package ch11_api.sec04_string;

import java.util.Arrays;

/*
 * byte array를 String으로 만들어주는 방법, 파일 I/O
 */
public class Ex01_ByteArray {
	public static void main(String[] args) throws Exception {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};

		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes,6,4);
		System.out.println(str2);

		byte[] inputBytes =new byte [10];
		System.out.println("입력 :");
		int readByteNo = System.in.read(inputBytes);
		
		String str = new String(inputBytes,0,readByteNo-2);  // \r\n을 제거하고 string으로만
		System.out.printf("%d,%s\n",readByteNo,str);
		System.out.println(Arrays.toString(inputBytes));
	}
}
