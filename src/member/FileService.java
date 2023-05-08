package member;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileService implements CommonService {	//CommonService 상속받고 경로 사용
	private File path;
	private FileOutputStream fos;
	private BufferedOutputStream bos;
	private ObjectOutputStream oos;

	private FileInputStream fis;
	private BufferedInputStream bis;
	private ObjectInputStream ois;



	public void inputData(MemberDTO dto) {	//throws사용시 다른것들도 설정을해야되서 try~catch사용
		//File path = new File(PATH+dto.getName()+".txt");	//저장할때 이름을 사용자 이름으로 저장
		try {
			fos = new FileOutputStream(path);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(dto);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null) oos.close();
				if(bos != null) bos.close();
				if(fos != null) fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public boolean checkUser(String name) {
		path = new File(PATH + name + ".txt");

		return path.exists();
	}


	public MemberDTO readData(String name) {	//MemberDTO 타입으로 반환


		MemberDTO dto = null;
		try {
			fis = new FileInputStream(path);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			dto = (MemberDTO)ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois != null) ois.close();
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}


		return dto;
	}
}












