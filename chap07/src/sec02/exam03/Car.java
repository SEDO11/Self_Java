package sec02.exam03;

public class Car {
	// �ʵ�
	Tire frontL = new Tire("frontL", 6);
	Tire frontR = new Tire("frontR", 2);
	Tire backL = new Tire("backL", 3);
	Tire backR = new Tire("backR", 4);
	
	// �޼ҵ�
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(frontL.roll()==false) {stop(); return 1; };
		if(frontR.roll()==false) {stop(); return 2; };
		if(backL.roll()==false) {stop(); return 3; };
		if(backR.roll()==false) {stop(); return 4; };
		return 0;
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
