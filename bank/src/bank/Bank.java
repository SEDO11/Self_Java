package bank;

import java.util.*;

public class Bank {

	public static void main(String[] args) {
		// ���� 3�� ����
		int acLength = 3;
		Account[] ac = new Account[acLength];
		ac[0] = new Account("ȫ�浿", 123123, 1234);
		ac[1] = new Account("������", 456456, 5678);
		ac[2] = new Account("������", 789789, 9012);

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		String cashId;
		String pwd;

		while (run) {
			println("------------------------------------------");
			println("| 1.�Ա� | 2.��� | 3.�ܾ���ȸ | 4.��ü | 5.���� |");
			println("------------------------------------------");
			int select = Integer.parseInt(sc.nextLine());
			switch (select) {
			
			case 1:
				println("�Ա�");
				print("���� ��ȣ�� �Է��ϼ���. >");
				cashId = sc.nextLine(); // ���¹�ȣ �Է�
					if (intCheck(cashId)) { // ���¹�ȣ�� �������� Ȯ��
						for (int i = 0; i < acLength; i++) { // for������ ������� ���¹�ȣ ��
							if (Integer.parseInt(cashId) == ac[i].getIdCheck()) { //���¹�ȣ�� ��ġ�� ���
								ac[i].nameIdPrint(); // ���� ��ȣ, �̸� ���
								println("���¹�ȣ�� Ȯ�εǾ����ϴ�.");
								print("�Աݾ��� �Է��ϼ��� > ");
								int money = Integer.parseInt(sc.nextLine());
								ac[i].setSumMoney(money);
								println("�ԱݵǾ����ϴ�. \n�����ܾ�" + ac[i].getMoney());
							}
						}
					} else {
						println("���� ��ȣ�� �� �� �Ǿ����ϴ�. \n���� ��ȣ�� ���ڷ� �̷���� �ֽ��ϴ�.");
					}
				break;
				
			case 2:
				println("���");
				print("���� ��ȣ�� �Է��ϼ���. >");
				cashId = sc.nextLine(); // ���¹�ȣ �Է�
				print("��� ��ȣ�� �Է��ϼ���. >");
				pwd = sc.nextLine(); // ��й�ȣ �Է�
				if (intCheck(cashId)) {
					for (int i = 0; i < acLength; i++) {
						// ���¹�ȣ�� ��й�ȣ�� ��ġ�� ���
						if (Integer.parseInt(cashId) == ac[i].getIdCheck() && Integer.parseInt(pwd) == ac[i].getPwdCheck()) {
							ac[i].nameIdPrint();
							println("���¹�ȣ�� Ȯ�εǾ����ϴ�.");
							while(true) {
								print("��ݾ��� �Է��ϼ��� > ");
								int money = Integer.parseInt(sc.nextLine());
								if(0 > ac[i].getMoney() - money) { //���� �ܾ��� ��ݾ� ���� ���� ���
									println("�ܾ��� �����մϴ�.");
									println("����� ����Ͻðڽ��ϱ�? | 1. yes | 2. no |");
									int result = Integer.parseInt(sc.nextLine());
									if(result == 1) { // yes�� ���� �� ��� �ʱ� ȭ������ ���ư�
										break;
									}
								} else { //���� �ܾ��� ��ݾ� ���� ū ���
									ac[i].setSubMoney(money);
									println("��ݵǾ����ϴ�. \n�����ܾ�" + ac[i].getMoney());
									break;
								}
							}
						}
					}
				} else {
					println("���� ��ȣ�� �� �� �Ǿ����ϴ�. \n���� ��ȣ�� ���ڷ� �̷���� �ֽ��ϴ�.");
				}
				break;
				
			case 3:
				println("�ܾ���ȸ");
				print("���� ��ȣ�� �Է��ϼ���. >");
				cashId = sc.nextLine(); // ���¹�ȣ �Է�
				print("��� ��ȣ�� �Է��ϼ���. >");
				pwd = sc.nextLine(); // ��й�ȣ �Է�
				if (intCheck(cashId)) {
					for (int i = 0; i < acLength; i++) {
						// ���¹�ȣ�� ��й�ȣ�� ��ġ�� ���
						if (Integer.parseInt(cashId) == ac[i].getIdCheck() && Integer.parseInt(pwd) == ac[i].getPwdCheck()) {
							ac[i].nameIdPrint();
							println("���¹�ȣ�� Ȯ�εǾ����ϴ�.");
							println("�����ܾ�: " + ac[i].getMoney());
						}
					}
				} else {
					println("���� ��ȣ�� �� �� �Ǿ����ϴ�. \n���� ��ȣ�� ���ڷ� �̷���� �ֽ��ϴ�.");
				}
				break;
				
			case 4:
				println("��ü");
				break;
				
			case 5:
				println("����");
				run = false;
				break;
				
			default:
				println("�߸� �� ���� �Դϴ�.");
				break;
			}
		}

	}

	public static void println(String str) { // \n print ���
		System.out.println(str);
	}

	public static void print(String str) { // \n ���� print ���
		System.out.print(str);
	}

	public static boolean intCheck(String num) { // �Էµ� ���� ���ڷ� �̷�� ������ �Ǻ��ϴ� �޼ҵ�
		for (int i = 0; i < num.length(); i++) {
			if (!Character.isDigit(num.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
