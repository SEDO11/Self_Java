package chap09.sec01.exam03;

public class A {
	// �ν��Ͻ� ���
	int field1;
	void method1() {}
	
	// ���� ���
	static int field2;
	static void method2() {}
	
	class B { // �ν��Ͻ�, ���� ��� �� ��� ����
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C { // ���� ����� ��� ����
		void method() {
			// �ν��Ͻ� ����� ����Ϸ��� �̷��� ����ؾ� ��
//			A a = new A();
//			a.field1 = 20;
//			a.method1();
			
			//�ν��Ͻ� ���
//			field1 = 20;
//			method1();
			
			// ���� ���
			field2 = 20;
			method2();
		}
	}
}
