package chap08.sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle v = new Bus();
		v.run();
		
		Bus bus = (Bus) v; // ���� Ÿ�� ��ȯ, Bus�� �ִ� �͵��� ��� ��� ����
		bus.checkFare();
		

	}

}
