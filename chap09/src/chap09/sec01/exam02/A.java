package chap09.sec01.exam02;

public class A {
	
	// �ν��Ͻ� �ʵ�
	B field1 = new B();
	C field2 = new C();
	
	void method1() { // �ν��Ͻ� �޼���
		B var1 = new B();
		C var2 = new C();
	}
	
	// ���� �ʵ�
	// static B field3 = new B(); // �ν��Ͻ� ��� Ŭ�����̱⿡ �������� ��� �Ұ�
	static C field4 = new C(); // ���� ��� Ŭ�����̱⿡ �������� ��밡��
	
	static void method2() { // A ��ü�� ���̵� ����� �� �ִ� �޼���
		// B var1 = new B(); // A ��ü�� �־�� ����� ���ִ� ��ü����
		C var2 = new C(); // C�� A�� ��� ����� �����ϱ⿡ ����
	}
	
	class B {} // �ν��Ͻ� ��� Ŭ����
	static class C {} // ���� ��� Ŭ����
	
}
