package sec02.exam03;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		if(++accumulatedRotation<maxRotation) {
			System.out.println(location + " 한국Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " 한국Tire 펑크 ***");
			return false;
		}
	}
}
