package sec02.exam03;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		if(++accumulatedRotation<maxRotation) {
			System.out.println(location + " �ѱ�Tire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + " �ѱ�Tire ��ũ ***");
			return false;
		}
	}
}
