package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		//���� ���� �� ������ ���� ��ü�� �����ϴ� �����̴�.
		
		if(strVar1 == strVar2) { //==�� ��ü�� ���� ������ �������� Ȯ��
			System.out.println("���� ��ü�� ������");
		} else {
			System.out.println("���� ��ü�� �������� ����");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("���ڿ��� ����");
		}
		
		String strVar3 = new String("�ɹ�ö");
		String strVar4 = new String("�ɹ�ö");
		//new�� ���ο� ��ü�� ����� ������ �ϹǷ� 1,2 / 3 / 4�� ���ڿ��� ������ ���� �ٸ� ��ü�� �����Ѵ�.
		
		if(strVar3 == strVar4) { //==�� ��ü�� ���� ������ �������� Ȯ��
			System.out.println("���� ��ü�� ������");
		} else { //3, 4�� ���δٸ� ��ü�� �����ϹǷ� false�� �ȴ�.
			System.out.println("���� ��ü�� �������� ����");
		}
		
		if(strVar3.equals(strVar4)) { //3, 4�� ���� �ٸ� ��ü�� ���������� ���ڿ��� �����Ƿ� true�� �ȴ�.
			System.out.println("���ڿ��� ����");
		}
	}

}
