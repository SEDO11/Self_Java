package chap06.sec03.Test01.exam02;

import java.util.*;

public class MemberExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���> ");
		String name = sc.nextLine();
		System.out.print("���̵� �Է��ϼ���> ");
		String id = sc.nextLine();
		
		Member member = new Member(name, id);
		
		System.out.println("�̸�: "+member.name);
		System.out.println("���̵�: "+member.id);
		

	}

}
