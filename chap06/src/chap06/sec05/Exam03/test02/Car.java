package chap06.sec05.Exam03.test02;

public class Car {
	int speed;
	
	void run() { // ���� �޼ҵ�, �ν��Ͻ� ��� �޼ҵ�
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	static void run(int i) { // ���� �޼ҵ�, ���� ��� �޼ҵ�
		Car myCar = new Car();
		myCar.speed = i;
		System.out.println(myCar.speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		// �ν��Ͻ� ��� ���
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		// ���� ��� ���
		run(50);

	}

}
