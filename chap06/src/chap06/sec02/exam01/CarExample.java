package chap06.sec02.exam01;

public class CarExample {

	public static void main(String[] args) { 
		
		Car myCar = new Car(); //Car Ŭ������ �ܺο��� �̿��ϱ����� ��ü�� �����Ѵ�.
		
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed + "km");
		System.out.println("����ӵ�: " + myCar.speed + "km");
		
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed + "km");
	}

}
