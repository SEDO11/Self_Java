package sec03.exam02;

public abstract class Animal { // �߻�Ŭ����
	// �ʵ�
	public String kind; // ������ ����
	
	// �޼���
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	// �߻� �޼���
	// Animal Ŭ������ ����ϴ� ��� �ڽ� Ŭ�������� ������ �� �޼��带 ������ �ؼ� ����ؾ� �Ѵ�.
	public abstract void sound();
}
