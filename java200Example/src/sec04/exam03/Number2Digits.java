package sec04.exam03;
//10~99������ �� ���߱� ���α׷�
import java.util.*;

public class Number2Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rd = (int) ((Math.random() * 90) + 10);
		boolean run = true;
		int x = 0;
		int numberTime = 0;
		int maxNumberTime = 10;
		
		System.out.println("���� ���߱� ���� ����!!");
		System.out.println("10~99 ������ ���� ���纸����.");
		System.out.printf("���� �õ� Ƚ��: %d\n", maxNumberTime);
		System.out.println();
		
		do {
			System.out.print("���� �Է��ϼ���.>");
			x = sc.nextInt();
			
			if(numberTime != maxNumberTime) {
				if(rd == x) {
					System.out.printf("\n���� ��ġ�մϴ�. ����: %d\n", rd);
					run = false;
				} else if(rd > x) {
					System.out.printf("\n�Է¹��� ���� �� �۽��ϴ�. x < %d\n", x);
					numberTime++;
					System.out.printf("���� �õ� Ƚ��: %d\n", maxNumberTime - numberTime);
				} else if(rd < x) {
					System.out.printf("\n�Է¹��� ���� �� Ů�ϴ�. x > %d\n", x);
					numberTime++;
					System.out.printf("���� �õ� Ƚ��: %d\n", maxNumberTime - numberTime);
				}
			} else {
				System.out.println("�ƽ��Ե� ���ڸ� ������ �� �߽��ϴ�.");
				run = false;
			}
			System.out.println();
		} while(run); 

		System.out.println("���α׷��� �����մϴ�.");

	}

}
