package chap06.sec04.Test.exam03;

import java.util.*;

public class MemberServiceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberService memSer = new MemberService();
		
		String id = sc.nextLine();
		String password = sc.nextLine();
		
		if(memSer.login(id, password)) {
			System.out.println("�α��� ����");
			memSer.logout(id);
		} else {
			System.out.println("id �Ǵ� paswword�� ��ġ���� �ʽ��ϴ�.");
		}
		
	}

}
