package sec07.exam04;

import java.util.Scanner;

public class SumExample {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("1���� ����� ���ұ��?: ");
		int x = sc.nextInt();
		
		long result = Sum.sum(x);
		System.out.printf("��� ���� ��: %d", result);

	}

}
