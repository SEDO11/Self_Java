package sec02.exam07;
//�Ǽ� Ÿ�� ���ͷ�
public class FloatDoubleExample {

	public static void main(String[] args) {
		
		//float var1 = 3.14; // �Ǽ����� �⺻Ÿ���� double �̶� f or F�� ������ ������ ������ ������ �߻��Ѵ�.
		float var2 = 3.14f;
		double var3 = 3.14;
		
		System.out.println(var2);
		System.out.println(var3);
		
		float var4 = 0.1234567890123456789f; //�Ҽ��� 7�ڸ����� ����� �����ϱ⿡ 8���� �ݿø��Ǿ� ��µ�, //������ ������ �߻����� ����
		double var5 = 0.123456789123456789; //�Ҽ��� 17�ڸ����� ����� ����
		
		System.out.println(var4);
		System.out.println(var5);
		
		double var6 = 3e6; // 3 * 10.0^6 = 3�鸸, e�� �Ǽ�Ÿ���� ���ͷ��̶� ����Ÿ�Կ����� ���Ұ�
		float var7 = 3e6f;
		double var8 = 2e-3;
		
		System.out.println(var6); 
		System.out.println(var7); 
		System.out.println(var8); 

	}

}
