package sec03.exam03;
//����Ÿ�Կ���
public class ByteOperationExample {

	public static void main(String[] args) {
		
		//�� Ÿ��, �����Ϸ����� ����
		byte result1 = 30 + 20; //�ǿ������� ����, Ÿ���� �������� �ʰ� ������ �� ������ �޴� ���� Ÿ���� ���� ������ �ؼ� ������ ������ �ȶ�
		System.out.println(result1);
		
		// int, JVM���� ����
		byte x = 10;
		byte y = 20;
		int result = x + y; //������ ������ �� int Ÿ������ ��ȯ�ǹǷ� �޴� ���� int�� ����
		System.out.println(result);
		
		// long, JVM���� ����
		byte x2 = 30;
		long y2 = 40L;
		long result2 = x2 + y2; //�ǿ����ڿ� long�� ������ long���� ��ȯ�ǹǷ� �޴� ���� long���� �����Ѵ�.
		System.out.println(result2);
	}

}
