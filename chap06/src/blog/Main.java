package blog;

public class Main {

	public static void main(String[] args) {
		// �ν��Ͻ� ���
		Instance1 i1 = new Instance1("��", "��");
		Instance1 i2 = new Instance1("��", "��");
		System.out.println(i1.instance1());
		System.out.println(i2.instance1());
		if(i1.y == i2.y) {
			System.out.println("���� ����");
		} else {
			System.out.println("�ٸ� ����");
		}
		
		// ���� ���
		System.out.println(Static1.static1());
		Static1.x = 3;
		Static1.y = 5;
		System.out.println(Static1.static1());

	}

}
