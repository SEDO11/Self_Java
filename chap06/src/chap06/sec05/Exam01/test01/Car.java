package chap06.sec05.Exam01.test01;
//�ν��Ͻ� ���
public class Car {
	//�ʵ�
	String model;
	int speed;
	int startSpeed;
	
	//������
	Car(String model, int startSpeed) {
		this.model = model;
		this.startSpeed = startSpeed;
	}
	
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int j=startSpeed; j<=startSpeed+50; j+=10) {
			this.setSpeed(j);
			System.out.printf("%s�� �޸��ϴ�. �ü�: %d km/h\n", model, speed);
		}
	}
}
