package chap06.sec05.Exam04.test02;

public class Singleton {
	private static Singleton sgt = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() { // ���⼭ Singleton �� ���� Ÿ���̴�.
		return sgt; // ��ü�� ���� ����
	}
}
