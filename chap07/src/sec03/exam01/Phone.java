package sec03.exam01;

public abstract class Phone { // �߻� Ŭ����
	//�ʵ�
	public String owner; // ������ ���� ���� �ʵ�
	
	//������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//�޼���
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
	
}
