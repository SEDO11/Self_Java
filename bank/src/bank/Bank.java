package bank;

import java.util.*;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.�������� | 2.����");
			System.out.print("����> ");
			int selct = sc.nextInt();
			
			switch(selct) {
				case 1:
					sc.nextLine();
					System.out.print("���̵� �Է��ϼ���.> ");
					String id = sc.nextLine();
					sc.nextLine();
					System.out.print("��й�ȣ�� �Է��ϼ���.> ");
					String pw = sc.nextLine();
					
					boolean check = acc.account(id, pw); 
					if(check) {
						System.out.println("���ο� ������ �����Ǿ����ϴ�.");
					} else {
						System.out.println("�̹� �ִ� ���̵��Դϴ�. �ٽ� �Է����ֽʽÿ�.");
					}
					break;
				case 2:
					System.out.println("�����մϴ�.");
					run = false;
					break;
				default:
			}
		}

	}

}
