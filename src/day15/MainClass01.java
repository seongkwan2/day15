package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass01 {
	public static void main(String[] args) throws FileNotFoundException {
		//String path = "C:\\test\\test.txt";
		File path = new File("C:\\test\\aaa.txt");
		
		//path.mkdir();	//해당하는 위치에 폴더생성
		path.delete(); //해당 위치의 이름의 파일이나 폴더 삭제
		//FileOutputStream fos = new FileOutputStream(path);
	}
}
