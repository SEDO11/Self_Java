package chap06.sec05.Exam04;

public class Singleton {
	//�ʵ�
	private static Singleton singleton = new Singleton();
	
	//������
	private Singleton() {
	}
	
	//�޼ҵ�
	static Singleton getInstance() {
		return singleton;
	}
}
