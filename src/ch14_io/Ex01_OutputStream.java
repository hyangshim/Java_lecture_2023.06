package ch14_io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex01_OutputStream {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/Temp/test.db");
		byte a =10;
		byte b =20;
		int c =30;
		os.write(a);
		os.write(b);
		os.write(c);        // 1byte,int type이지만 1 byte만 써짐
		
		byte[] array = {10,20,30,40,50}; // 5byte
		os.write(array);
		
		os.write(array,1,3);            // 3byte
		os.flush();
		os.close();
		
	}

}
