package sec07.exam08;

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Example exam = new Example();
		int selct;
		
		do {
			int rand = (int) (Math.random()*4+1);
			exam.culc(rand);
			
			System.out.printf("�ٽ� �ϰڽ��ϱ�? 1.�� | 2. �ƴϿ�: ");
			selct = sc.nextInt();
			
		} while(selct == 1);
		System.out.println("���α׷��� �����մϴ�.");

	}

}
