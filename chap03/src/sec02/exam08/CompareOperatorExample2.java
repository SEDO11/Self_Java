package sec02.exam08;
//�� ������, float�� double�� ����
public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		//�ǵ����̸� ���� ���� �Ἥ ���ϴ� ����� ������� ���ƶ�
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println((double)v5); //0.1���� �� ŭ
		System.out.println(v4 == v5); //0.1f�� 0.1���� �� ũ�Ƿ� false�� ���
		System.out.println((float)v4 == v5); //double�� float���� ���� ��ȯ�Ͽ� ��
		System.out.println((int)(v4*10) == (int)(v5*10)); //int, ���������� ���� ��ȯ�Ͽ� ��
		
	}

}
