package chap06.sec05.Exam04.Test01;
//�ϳ��� ��ü�� ����, �̱���
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	static Singleton getInstance() {
		return singleton;
	}
}
