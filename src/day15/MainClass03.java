package day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass03 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:\\test\\test.txt");
		FileInputStream fis = new FileInputStream(path);
		
		while(true) {
			int ch = fis.read();
			if(ch == -1) {	//파일의 끝에는 -1 이라는 값이 자동으로 온다 (EOF)
				System.out.println("ch : "+ch);
				break;
			}
			System.out.println((char)ch);
		}
		
		
		
		
		
	}
}



















