package sec03.testExam02;
//�Է��� �� ������ Ȧ, ¦ �����ϱ�
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a % 2 != 0 && b % 2 != 0) {
			System.out.println("���ʴ� Ȧ ��");
		} else if (a % 2 != 0 || b % 2 != 0) {
			System.out.println("�ϳ��� Ȧ ��");
		} else {
			System.out.println("���� �� ¦ ��");
		}
		

	}

}
