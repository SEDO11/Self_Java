package sec03.exam01;
//�ڵ�Ÿ�Ժ�ȯ
public class PromotionExample {

	public static void main(String[] args) {
		//byte -> int
		byte byteValue = 10; //byte Ÿ������ 10�� ����
		int intValue = byteValue; //int Ÿ������ 10�� ����
		System.out.println("intValue: " + intValue); //int Ÿ������ ����� 10�� ���
		
		//char -> int
		char charValue = '��';
		intValue = charValue;
		System.out.println("intValue: " + intValue);
		
		//int -> long
		intValue = 30;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		//long -> float
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		// float -> double
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}
