package chap06.sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) { //�޼ҵ尡 boolean Ÿ���� ���� �����ϱ⿡ ���ǽĿ� �� �� ����
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�."); //�����ٰ� �ϸ� if �Ǵ� else ���� ���� �� ����
		} else {
			System.out.println("gas�� �����ϼ���."); //�ؿ� �����Ƿ� ��� ������ �� �����Ķ� ���⸸ ����
		}
	}

}
