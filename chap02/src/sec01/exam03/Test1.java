package sec01.exam03;

public class Test1 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int z = 7;
		System.out.println("x�� ��: " + x + ", y�� ��: " + y + ", z�� ��: " + z); //���� ����x
		
		int temp = x;
		x = y;
		y = z;
		z = temp;
		System.out.println("x�� ��: " + x + ", y�� ��: " + y + ", z�� ��: " + z); //������ �����

	}

}
