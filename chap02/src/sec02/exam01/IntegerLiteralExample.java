package sec02.exam01;
//���ͷ� ����, 2, 8, 10, 16���� �̿�
public class IntegerLiteralExample {

	public static void main(String[] args) {
		
		int var1 = 0b1011; //var1 ������ 2���� ������ 11 �ʱ�ȭ, 2������ �տ� 0b�� ���δ�.
		int var2 = 013; //var2�� 8���� ������ 11 �ʱ�ȭ, 8������ �տ� 0�� ���δ�.
		int var3 = 11; //var3�� 10���� ������ 11 �ʱ�ȭ, 10������ �׳� ����.
		int var4 = 0xB3; //var4�� 16���� ������ 179 �ʱ�ȭ, 16������ �տ� 0x�� ���δ�.
		
		System.out.println("var1(2����): " + var1);
		System.out.println("var2(8����): " + var2);
		System.out.println("var3(10����): " + var3);
		System.out.println("var4(16����): " + var4);

	}

}
