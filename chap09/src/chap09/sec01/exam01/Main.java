package chap09.sec01.exam01;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B(); // ��øŬ����, �ν��Ͻ� ��� Ŭ���� ��ü ����
		b.field1 = 3;
		b.method1();
		
		// ��ü�� �����Ͽ� ȣ��
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		
		// ��ü���� ���� �̸����� �ٷ� ȣ��
		A.C.field2 = 3;
		A.C.method2();
		
		a.method();
	}

}
