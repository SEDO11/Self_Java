package test04.exam02;

import java.util.*;

public class Test07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("\n----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("����> ");
			balance = sc.nextInt();
			switch(balance) {
				case 1:
					System.out.print("����: ");
					money += sc.nextInt();
					break;
					
				case 2:
					System.out.print("���: ");
					money -= sc.nextInt();
					break;
					
				case 3:
					System.out.println("�ܰ�: " + money);
					break;
					
				case 4:
					run = false;
					break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
