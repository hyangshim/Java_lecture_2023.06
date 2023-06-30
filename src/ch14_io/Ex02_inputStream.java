package ch14_io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Ex02_inputStream {
	public static void main(String[] args) throws Exception{
		InputStream is = new  FileInputStream("c:/Temp/test.db");
		
		
		//방법 1
//		while (true) {
//			int data =is.read();
//			if (data == -1)
//				break;
//			System.out.print(data+ " ");
//		}
//		System.out.println("------------------");
		
		
		//방법2
		byte[] arr =new byte[100];
		while (true) {
			int num =is.read(arr);
			System.out.println("읽은 바이트 수:"+num);
			if (num == -1);
			break;
		}
		System.out.println(Arrays.toString(arr));
		
		is.close();
	}

}
