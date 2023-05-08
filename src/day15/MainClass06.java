package day15;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainClass06 {
	public static void main(String[] args) throws Exception {
		TestClass06 t = new TestClass06();
		t.setName("홍길동");
		t.setAge(20);
		
		//File path = new File("C:/test/test.txt");
		FileOutputStream fos = new FileOutputStream(CommonPath.PATH);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);	//직렬화를 사용하기 위한 코드
		
		oos.writeObject(t);
		//여기에 들어온 t (TestClass06) 에 가서
		//implements Serializable (상속을 받아서 직렬화를 시켜야한다.)
		
		oos.close(); bos.close(); fos.close();
	}
}
















