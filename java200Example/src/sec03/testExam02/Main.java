package sec03.testExam02;
//�Է��� �� ������ Ȧ, ¦ �����ϱ�
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == 0 && b == 0) {
			System.out.println("a�� b�� �Ѵ� 0�Դϴ�.");
		} else if(a < 0 || b < 0) {
			System.out.println("�Ѵ� Ȥ�� ���߿� �ϳ��� ���� �Դϴ�.");
		} else if(a%2==0 && b%2==0) {
			System.out.println("a�� b�� �Ѵ� ¦�� �Դϴ�.");
		} else if(!(a%2==0 || b%2==0)) {
			System.out.println("a�� b�� �Ѵ� Ȧ�� �Դϴ�.");
		} else {
			System.out.println("���߿� �ϳ��� Ȧ�� �Դϴ�.");
		}
		

	}

}
