// ��ó�� �Ǳ� ������ 3�� �ǽ�
package ipe;

public class Exam01 {
	public static void main(String[] args) {
		SuperClass s = new SubClass();
	}
}

class SuperClass { // �θ� Ŭ����
	SuperClass() {
		System.out.print("Super");
	}
}

class SubClass extends SuperClass { // �ڽ� Ŭ����
	SubClass() {
		System.out.print("Sub");
	}
}
