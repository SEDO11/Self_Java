package sec07.exam16second;
//�迭�� ������ �ּڰ� ���ϱ� ���1
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x;
		int y;
		do {
			System.out.print("�迭�� ���� �Է�: ");
			x = Main.sc.nextInt();
			
			long result = MinOf.minOf(x);
			System.out.println("�ּڰ�: " + result);
			
			System.out.printf("�����ϰڽ��ϱ�? 1.�� | 2. �ƴϿ�");
			y = Main.sc.nextInt();
		} while( y != 1);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

	}

}
