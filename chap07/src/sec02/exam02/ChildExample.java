package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		System.out.println();
		// �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ ���Ŀ��� �θ� Ŭ������ ����� �ʵ� �� �޼ҵ常 ���� ����
		// ���������� �޼ҵ尡 �ڽ� Ŭ�������� �����ǵ� ��� �ڽ� Ŭ������ �޼ҵ尡 ��� ȣ��
		Parent p = c;
		p.m1(); // �θ�Ŭ���� ȣ��
		p.m2(); // �޼ҵ� �������̵����� ���� �ڽ�Ŭ���� ȣ��
//		p.m3(); // �θ� Ŭ������ ���� �޼ҵ� �̹Ƿ� ��� �Ұ�
	}

}
