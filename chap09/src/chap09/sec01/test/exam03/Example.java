package chap09.sec01.test.exam03;

public class Example {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire(); // �ν��Ͻ�
		Car.Engine engine = new Car.Engine(); // ����

	}

}
