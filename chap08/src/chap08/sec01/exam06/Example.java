package chap08.sec01.exam06;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("1)--------------------------");
		
		// ó������ TV ���� Ŭ������ �ʱ�ȭ ���ֱ⿡ TV ���� Ŭ������ �����ǵ� �޼��� ���
		MyClass mc1 = new MyClass();
		mc1.rc.turnOn();
		mc1.rc.setVolume(5);
		
		System.out.println("2)--------------------------");
		
		// ����� ���� Ŭ������ �ʱ�ȭ
		MyClass mc2 = new MyClass(new Audio());
		
		System.out.println("3)--------------------------");
		
		// TV ���� Ŭ������ �ʱ�ȭ
		MyClass mc3 = new MyClass();
		// ����� ���� Ŭ������ ������ �� �޼��� ���
		mc3.methodA();
		
		System.out.println("4)--------------------------");
		
		// TV ���� Ŭ������ �ʱ�ȭ
		MyClass mc4 = new MyClass();
		// TV ���� Ŭ������ ������ �� �޼��� ���
		mc4.methodB(new Television());
	}

}
