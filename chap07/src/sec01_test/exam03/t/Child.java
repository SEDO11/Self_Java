package sec01_test.exam03.t;

public class Child extends Parents{
	public static final int P = 1; // �Ϲ� ������
	public static final int C = 2; // ���� ������
	
	public int mode = C; // ������ ���� ����, �ʱⰪ �Ϲݸ��
	
	@Override
	public void str() {
		if(mode == C) {
			System.out.println("Child");
		} else {
			super.str();
		}
	}
}
