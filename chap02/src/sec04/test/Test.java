package sec04.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("[�ʼ� ���� �Է�]");
		System.out.print("\n1. �̸�: ");
		String name = scan.nextLine();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		String rNumber = scan.nextLine();
		System.out.print("3. ��ȭ��ȣ: ");
		String pNumber = scan.nextLine();
		
		System.out.println("\n[�Է��� ����]");
		System.out.println(name);
		System.out.println(rNumber);
		System.out.println(pNumber);
		
	}

}
