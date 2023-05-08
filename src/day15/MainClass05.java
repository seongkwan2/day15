package day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) throws Exception{
		File path = new File("C:/test/test.txt");	//파일 생성
		
		//내용입력
		FileOutputStream fos = new FileOutputStream(path);		  //입력기능 생성
		BufferedOutputStream bos = new BufferedOutputStream(fos); //저장소 생성
		DataOutputStream dos = new DataOutputStream(bos);		  //저장소에 String사용가능
		
		System.out.println("출력 내용 입력");
		String n = new Scanner(System.in).next();
		
		dos.writeUTF(n);
		
		dos.close();
		bos.close();
		fos.close();
		
		//내용출력
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String s = dis.readUTF();
		System.out.println("가져온 내용: " + s);
		
		dis.close(); bis.close(); fis.close();
		//출력은 역순으로 닫음
		
	}
}



















