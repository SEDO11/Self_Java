package sec01.exam06;

public class Car {
	//�ʵ�
	public int speed;
	
	//������
	
	//�޼ҵ�
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
	
}
