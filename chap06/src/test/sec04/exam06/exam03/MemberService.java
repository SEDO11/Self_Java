package test.sec04.exam06.exam03;

public class MemberService {
	private String id = "hong";
	private String pwd = "12345";
	
	
	boolean login(String id, String pwd) {
		
		if(id.equals(this.id) && pwd.equals(this.pwd)) {
			System.out.println("�α��� ����");
			logout(id);
			return true;
		}
		System.out.println("�α��� ����");
		return false;
	}
	
	void logout(String id) {
		System.out.println(id + " �α׾ƿ�");
	}
}
