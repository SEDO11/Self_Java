package chap06.sec04.exam03;

public class Car {
	//�ʵ�
	int gas;
	
	//������
	
	//�޼ҵ�
	void setGas(int gas) { //�Է¹��� ������ �ʵ忡 ����
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas <= 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		} 
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas�ܷ�: " + gas + ")");
				gas--;
			} else {
				System.out.println("����ϴ�. (gas�ܷ�: " + gas + ")");
				return; //���α׷� ����� ���� return
			}
		}
	}
}
