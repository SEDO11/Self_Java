package sec02.exam01;
//���ͷ� ����
public class IntegerLiteralExample {

	public static void main(String[] args) {
		
		int var1 = 0b1011; //var1 ������ 2���� ������ 11 �ʱ�ȭ
		int var2 = 013; //var2�� 8���� ������ 11 �ʱ�ȭ
		int var3 = 11; //var3�� 10���� ������ 11 �ʱ�ȭ
		int var4 = 0xB3; //var4�� 16���� ������ 179 �ʱ�ȭ
		
		System.out.println("var1(2����): " + var1);
		System.out.println("var2(8����): " + var2);
		System.out.println("var3(10����): " + var3);
		System.out.println("var4(16����): " + var4);

	}

}
