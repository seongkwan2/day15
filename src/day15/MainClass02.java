package day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass02 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:/test/test.txt");
		FileOutputStream  fos = new FileOutputStream(path, true);	//쓰기(내보내기)
		fos.write(65);
		fos.write('B');	//내용 작성
		
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);	//읽기(불러오기)
		System.out.println(fis.read());
		System.out.println(fis.read());
		fis.close();
	}
}
