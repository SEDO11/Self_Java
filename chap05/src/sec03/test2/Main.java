package sec03.test2;

public class Main {

	public static void main(String[] args) {
		LoginResult result = LoginResult.SUCCESS; //���� ���� ����, ���� ����� ���� ���� ��°��� ����
		
		if(result == LoginResult.SUCCESS) {
			System.out.println("�α��ο� �����߽��ϴ�.");
		} else if(result == LoginResult.FAIL_ID) {
			System.out.println("�α��� ���� \n���̵� Ʋ�Ƚ��ϴ�.");
		} else if(result == LoginResult.FAIL_PASSWORD) {
			System.out.println("�α��� ���� \n��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}

	}
}