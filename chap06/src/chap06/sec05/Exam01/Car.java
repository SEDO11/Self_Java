package chap06.sec05.Exam01;

public class Car {
	//�ʵ�
	String model; //�ν��Ͻ� �ʵ�
	int speed;
	
	//������
	Car(String model) {
		this.model = model;
	}
	
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i); //���⼭ this�� �ᵵ �ǰ� �Ƚᵵ ��
			System.out.println(this.model + "�� �޸��ϴ�. (�ü�: " + this.speed + "km/h)");
			//���⿡���� this�� ������ �� ������ ��, ���� �̸��� �Ű������� ���� ������
		}
	}
}
