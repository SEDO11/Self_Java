package sec01_test.exam03;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r; // �� �� ��Ȯ�ϰ� ���
	}
}
