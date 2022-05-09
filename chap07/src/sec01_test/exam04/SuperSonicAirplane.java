package sec01_test.exam04;

public class SuperSonicAirplane extends AirPlane{
	public static final int NORMAL = 1; // �Ϲ� ������
	public static final int SUPERSONIC = 2; // ���� ������
	
	public int flyMode = NORMAL; // ������ ���� ����, �ʱⰪ �Ϲݸ��
	
	// ctrl + space �ϰ� ���� ���� ������ �������̵��� �ڵ����� ����
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		} else {
			super.fly(); // �θ� �ִ� fly �޼ҵ� ȣ��
		}
	}
	
}
