package sec02.exam10;
//���� ������
public class AssignmentoperatorExample {

	public static void main(String[] args) {
		int result = 0; //������ ������ 0���� �ʱ�ȭ
		
		result += 10; //10�� �����ְ� ���� ���� 0 + 10 = 10
		System.out.println(result); // 10
		result -= 5; // 5�� ���ְ� ���� ���� 10 - 5 = 5
		System.out.println(result); // 5
		result *= 3; // 3�� �����ְ� ���� ���� 5 * 3 = 15
		System.out.println(result); // 15
		result /= 5; // 5�� ������ ���� ���� ���� 15 / 5 = 3
		System.out.println(result); // 3
		result %= 3; // 3���� ������ ���� �������� �����Ѵ� 3 % 3 = 0
		System.out.println(result); // 0

	}

}
