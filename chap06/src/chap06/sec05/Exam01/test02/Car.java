package chap06.sec05.Exam01.test02;

public class Car {
	// �ν��Ͻ� �ʵ�
	String model;
	int speed;
	
	// �ν��Ͻ� ������
	Car(String model) {
		this.model = model;
	}
	
	// �ν��Ͻ� �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			setSpeed(i);
			System.out.println(this.model + " " + this.speed);
		}
	}
}
