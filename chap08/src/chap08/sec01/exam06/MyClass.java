package chap08.sec01.exam06;

public class MyClass {
	//�ʵ�
	RemoteControl rc = new Television(); // �⺻���� TV ����Ŭ������ �ʱ�ȭ
	
	//������
	MyClass() {
		
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//�޼���
	void methodA() { // ����� ���� Ŭ���� ���
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
