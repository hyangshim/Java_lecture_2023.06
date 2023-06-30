package ch14_io;

import java.io.FileWriter;
import java.io.Writer;

public class Ex01_Writer {
	public static void main(String[] args) throws Exception{
		Writer writer =new FileWriter("c:/Temp/test.txt");
		
		// 한 문자씩test.txt 파일에 입력해줌
		char a = 'A',b='B';
		writer.write(a);writer.write(b);
		
		
		// char test.txt 파일에 추가 입력
		char[] arr = {'C','D','E'};
		writer.write(arr);
		
		// 문자열 입력하기
		writer.write("FG\n");
		writer.write("한글도 잘 써집니다.\n");
		
		writer.flush();
		writer.close();
	}

}
