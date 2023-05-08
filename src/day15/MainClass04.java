package day15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass04 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/test/test.txt");
		
		//저장소에 저장했다가 한번에 출력하는 느낌
		BufferedOutputStream bos = new BufferedOutputStream(fos);	//저장소개념
		//보조스트림은 기존스트림을 바탕으로 만듬
		
		
		for(char i = 'A'; i<='D'; i++) {
			Thread.sleep(2000);
			//fos.write(i);
			bos.write(i);
		}
		bos.flush();	//비워라 라는 의미 (출력)
		
		bos.write("안녕하세요".getBytes());
		bos.close();	//닫으면서 출력
		
		//bos.write("안녕하세요".getBytes());	//닫았기 때문에 불가능
		fos.close();
	}
}
