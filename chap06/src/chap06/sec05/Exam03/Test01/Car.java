package chap06.sec05.Exam03.Test01;

public class Car {
	//�ν��Ͻ� ���, �ʵ� ����
	int speed;
	
	//�ν��Ͻ� ���, ������
	Car(int speed){
		this.speed = speed;
	}
	
	//�ν��Ͻ� ���, �޼ҵ�
	void run(){
		System.out.printf("%d�� �ӵ��� �޸��ϴ�.", speed);
	}

	public static void main(String[] args) { //���� ���
		Car myCar = new Car(50); //���� ��� �������� �ν��Ͻ� ����� �׳� ��� �� �� �����Ƿ� ��ü�� �����ϰ� �� �� ����Ѵ�.
		myCar.run();

	}

}
