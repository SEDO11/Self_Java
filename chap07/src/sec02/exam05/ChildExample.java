package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// ����Ÿ�Ժ�ȯ
		// �ڽİ�ü�� �θ�ü�� �ڵ� Ÿ�Ժ�ȯ ��
		// �ٽ� �ݴ�� ��ȯ�� �� ���
		// �ڽ��� ���� Ÿ������ ���ư��� ��
		Parent p1 = new Child();
		p1.field1 = "xxx";
		p1.m1();
		p1.m2();
		// �Ұ���
//		c1.field2 = "yyy";
//		c1.m3();
		
		// ����Ÿ�Ժ�ȯ
		Child c1 = (Child) p1;
		// ����
		c1.field2 = "yyy";
		c1.m3();
		
		// �θ�ü�� ����� ���� �ڽİ�ü�� ����Ÿ�Ժ�ȯ �Ұ�
//		Parent p2 = new Parent();
//		Child c2 = (Child) p2;
//		c2.m1();

	}

}
