package sec07.exam15;

import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		SumOf sum = new SumOf();
		Main in = new Main();
		int x;
		int y;
	
		do {
		System.out.print("��� �迭�� ����ڽ��ϱ�?: ");
		x = in.sc.nextInt();
		sum.sumOf(x);
		
		System.out.printf("�����ϰڽ��ϱ�? 1.�� | 2. �ƴϿ�");
		y = in.sc.nextInt();
		
		} while(y != 1);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}