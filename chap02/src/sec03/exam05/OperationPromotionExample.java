package sec03.exam05;
//�ڵ�Ÿ�Ժ�ȯ, ����Ÿ�Ժ�ȯ
public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int byteValue3 = byteValue1 + byteValue2;
		System.out.println("������ ����: " + byteValue3);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int charValue3 = charValue1 + charValue2; // 65 + 1
		System.out.println("�����ڵ�: " + charValue3); //int 66
		System.out.println("��¹���: " + (char)charValue3); //char 'B'
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; //������ ������ �̹Ƿ� 2.5�� �ƴ� 2�� ����
		System.out.println("������ ������: " + intValue4);
		
		double doubleValue = intValue3 / 4.0; // �Ǽ��� ������ �̹Ƿ� 2.5�� ����
		System.out.println("�Ǽ��� �ٲپ ������: " + doubleValue);
		
		int x = 1;
		int y = 2;
		double result1 = x / y;
		double result2 = (double)x / y;
		System.out.println("�������� �Ǽ����� �޾Ƽ� ������: " + result1);
		System.out.println("�������� �Ǽ������� �ٲٰ� �޾Ƽ� ������: " + result2);
	}

}
