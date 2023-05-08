package member;

public class MemberService {
	private FileService fs;
	
	public MemberService() {
		fs = new FileService();
	}
	
	
	public void save(MemberDTO dto) {	//저장하는 역할
		fs.inputData(dto);
	}
	
	public boolean checkUser(String name) {//파일이 존재하는것인지 아닌지 판단
		return fs.checkUser(name);
	}
	
	public MemberDTO getMember(String name) {
		return fs.readData(name);
	}
	
	
	
	
	
	
	
	
	
	
}
