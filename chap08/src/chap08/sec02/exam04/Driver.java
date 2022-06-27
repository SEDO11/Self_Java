package chap08.sec02.exam04;

public class Driver {
	public void drive(Vehicle v) { // bus or taxi ��ü�� ����
		if(v instanceof Bus) { // ��ü�� ���� ���� �ý����� Ȯ��
			Bus bus = (Bus) v;
			bus.checkFare();
		} else {
			Taxi taxi = (Taxi) v;
			taxi.checkFare();
		}
		v.run(); // ���Ե� ���� ��ü�� run �޼��尡 ���त
	} 
}
