package chap06.sec04.exam03;

public class TestCar {
	//�ʵ� ����
	int gas;
	
	//������
	
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas <= 0) {
			System.out.println("�⸧�� �����ϴ�.");
			return false;
		}
		System.out.println("�⸧�� �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		if(gas > 0) {
			System.out.printf("���� �޸��ϴ�. �⸧�ܷ� %d(L)\n\n", gas);
			gas--;
		} else {
			System.out.printf("���� ����ϴ�. �⸧�ܷ� %d(L)\n\n", gas);
			return;
		}
	}
	
}
