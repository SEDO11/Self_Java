package chap08.sec01.exam04;

public class Example { // ���� Ŭ����

	public static void main(String[] args) {
		// �������� ���� ���� Ŭ������ �޼��� ȣ��
		
		RemoteControl rc = new Television(); // ������
		// Television Ŭ�������� �������� �޼��� ���
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println();
		
		RemoteControl rc2 = new Audio(); // ������
		// Audio Ŭ�������� �������� �޼��� ���
		rc2.turnOn();
		rc2.setVolume(6);
		rc2.turnOff();

	}

}
