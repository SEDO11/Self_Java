package chap06.sec05.Exam03;
//���� �޼ҵ� ��� ����
public class Car {
	//ù ��° ���
	static int speed;
	
	static void run() {
		System.out.println(speed + " ���� �޸��ϴ�.");
	}
	
	
	//static�� �پ������Ƿ� main �޼ҵ嵵 ���� �޼ҵ� �̴�.
	public static void main(String[] args) {
		speed = 60;
		run();
	}
	
	/*
	 * //�� ��° ���
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	
	//static�� �پ������Ƿ� main �޼ҵ嵵 ���� �޼ҵ� �̴�.
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.speed = 60;
		myCar.run();
	}
	*/
}
