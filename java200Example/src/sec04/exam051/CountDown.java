package sec04.exam051;

import java.util.*;

public class CountDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���.: ");
		int x = sc.nextInt();
		
		if(x>0) {
			do {
				System.out.printf("ī��Ʈ �ٿ�: %d\n", x--);
			} while(x >= 0);
		}
		System.out.printf("���α׷��� ���� �Ǿ����ϴ�. ī��Ʈ �ٿ�: %d\n", x); 
	}

}
