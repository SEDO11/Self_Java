package chap09.sec01.exam01;

public class A {
	
	int field4;
	A() { // ������
		System.out.println("A ��ü�� ������");
	}
	
	class B { // �ν��Ͻ� ��� Ŭ���� / �����ʵ�, �����޼���� ��� �Ұ�
		B() {
			System.out.println("B ��ü�� ������");
		}
		int field1; // �ν��Ͻ� �ʵ�
		// static int field2; �����̶� ��� �Ұ�
		void method1() {} // �ν��Ͻ� �޼���
		// static void method2() {} �����̶� ��� �Ұ�
	}
	
	static class C { // ���� ��� Ŭ���� / �ν��Ͻ�, ���� �Ѵ� ��� ����
		C() {
			System.out.println("C ��ü�� ������");
		}
		int field1; // �ν��Ͻ� �ʵ�
		static int field2; // ���� �ʵ�
		void method1() {} // �ν��Ͻ� �޼���
		static void method2() {} // ���� �޼���
	}
	
	void method() { // �޼��� ���� ����� ��øŬ����, ����Ŭ����
		class D { // ���� Ŭ���� / �ν��Ͻ� �ʵ�� �޼��常 ���� ����
			D() { // ������
				System.out.println("D ��ü�� ������");
			}
			int field1; // �ν��Ͻ� �ʵ�
			// static int field2; ���� �ʵ�� ��� �Ұ�
			void method1() {} // �ν��Ͻ� �޼���
			// static void method2{} ���� �޼���� ��� �Ұ� 
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
