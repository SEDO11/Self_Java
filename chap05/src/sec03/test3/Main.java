package sec03.test3;
//����Ÿ��
import sec03.test.LoginResult;

public class Main {

	public static void main(String[] args) {
		LoginResult result = LoginResult.SUCCESS;
		if(result == LoginResult.SUCCESS) {
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		} else if (result == LoginResult.FAIL_ID) {
			System.out.println("�α��� ���� ���̵� Ʋ�Ƚ��ϴ�.");
		} else if (result == LoginResult.FAIL_PASSWORD) {
			System.out.println("�α��� ���� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} 

	}

}
