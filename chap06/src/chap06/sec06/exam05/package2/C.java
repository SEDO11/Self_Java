package chap06.sec06.exam05.package2;
import chap06.sec06.exam05.package1.A;

public class C {
	//������
	public C() {
		A a = new A();
		a.field = 10;
		a.method();
	}
	
	//�޼ҵ�
	public void method() {
		A a = new A();
		a.field = 10;
		a.method();
	}
}
