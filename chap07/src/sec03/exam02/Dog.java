package sec03.exam02;

public class Dog extends Animal{
	public Dog() {
		kind = "������"; // �߻� Ŭ���� �ʵ� ���
	}
	
	@Override // �߻�Ŭ���� �޼��� ������
	public void sound() {
		System.out.println("�۸�");
	}

}
