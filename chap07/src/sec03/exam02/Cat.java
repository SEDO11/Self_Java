package sec03.exam02;

public class Cat extends Animal{
	public Cat() {
		kind = "������"; // �߻� Ŭ���� �ʵ� ���
	}
	
	@Override // �߻�Ŭ���� �޼��� ������
	public void sound() {
		System.out.println("�߿�");
	}
}
