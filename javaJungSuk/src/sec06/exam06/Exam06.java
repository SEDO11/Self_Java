package sec06.exam06;

public class Exam06 {
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((double) Math.pow(x1-x, 2) + Math.pow(y1-y, 2));
	}
	
	public static void main(String args[]) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
