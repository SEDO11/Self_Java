package chap06.sec02.Test02;

import java.util.*;

public class MemberExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		
		member.name = "������";
		member.age = 24;
		member.id = "dhtpgns";
		member.password = "1234";
		
		System.out.print("���̵� �Է��ϼ���.> ");
		String idEnter = sc.nextLine(); 
		System.out.print("��й�ȣ�� �Է��ϼ���.> ");
		String pwEnter = sc.nextLine();
		
		if(member.id.equals(idEnter) && member.password.equals(pwEnter)) {
			System.out.println("���� Ȯ��, ���̵�� ��й�ȣ�� ��ġ�մϴ�.");
			System.out.printf("���� �̸�: %s\n", member.name);
			System.out.printf("���� ����: %s\n", member.age);
			
		} else if(!(member.id.equals(idEnter) || member.password.equals(pwEnter))) {
			System.out.println("���̵�� ��й�ȣ �� �� Ʋ�Ƚ��ϴ�.");
			
		} else if(!(member.id.equals(idEnter))) {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
			
		} else if(!(member.password.equals(pwEnter))) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		} 

	}

}
