package whileExample.beak10951;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) { //hasNextInt(), �Է¹޴� ���� �������� �ƴ��� Ȯ��, �����̸� ���α׷��� ����ǰ� �ƴϸ� ����ȴ�.
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = x + y;
			System.out.println(sum);
        
		}
	}
}