package sec02.exam03;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		if(++accumulatedRotation<maxRotation) {
			System.out.println(location + " ��ȣTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + " ��ȣTire ��ũ ***");
			return false;
		}
	}
}
