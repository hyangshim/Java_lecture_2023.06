package ch14_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * BufferedRedader 를 사용하면 Line 단이로  글을 읽을 수있음
 */
public class Ex07_ReadLine {
	public static void main(String[] args) throws Exception {
		BufferedReader br =new BufferedReader(new FileReader("c:/Temp/test.txt"));
		int lineNo = 1;
		while (true) {
			String line =br.readLine();
			if (line == null)
				break;
			System.out.println(lineNo + " : "+line);
			lineNo ++;
		}
		br.close();
	}

}
