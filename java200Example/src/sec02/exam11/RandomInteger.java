// ���� �Լ�
package sec02.exam11;

public class RandomInteger {

	public static void main(String[] args) {
		int x = (int) ((Math.random() * 9) +1); // 1�̻� 9������ �� ���� ����
		int y = (int) ((Math.random() * -9) -1); // -9�̻� -1������ �� ���� ����
		int z = (int) ((Math.random() * 90) +10); // 10�̻� 99������ �� ���� ����
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
