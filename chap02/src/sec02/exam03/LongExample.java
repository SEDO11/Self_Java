package sec02.exam03;
// ������, long�� 900����� ǥ���� �� ������ 
//L�� �Ⱦ��� Java���� int������ �о ������ ���. int���� 20������� ǥ�� �����ϴ�
public class LongExample {

	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 20000000000; �ڹٰ� L�� �Ⱥ����� int������ �ν��Ͽ� ������ �߻�
		long var3 = 20000000000L; //200��, L�� ������ LongŸ������ �����ؼ� �����Ͽ����� �߻����� ����
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
	}

}
