package test2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.���� 2.��� 3.�ܾ���ȸ 4.����");
			System.out.println("--------------------------");
			String select = sc.nextLine();
			
			if(select.equals("1")) {
				System.out.print("������ �ݾ��� �Է��ϼ���. \n�ݾ�: ");
				String str = sc.nextLine();
				int money = Integer.parseInt(str);
				balance += money;
			} else if (select.equals("2")) {
				System.out.print("����� �ݾ��� �Է��ϼ���. \n�ݾ�: ");
				String str = sc.nextLine();
				int money = Integer.parseInt(str);
				if(balance < money) {
					System.out.println("���� ���� �ִ� �ݾ׺��� �ʰ� �ǹǷ� \n����� �� �� �����ϴ�.");
				} else {
					balance -= money;
				}
			} else if (select.equals("3")) {
				System.out.printf("���� �ܾ�: %d", balance);
			} else if (select.equals("4")) {
				System.out.println("�ý����� �����մϴ�.");
				run = false;
			} else {
				System.out.println("�߸� �� �����Դϴ�.");
			}
			System.out.println();
		}

	}

}
