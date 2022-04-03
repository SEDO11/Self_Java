package python50_100;

import java.util.Scanner;

public class Exam1977 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int min = 0;
		int i = 1;
		int result = 0;
		while(n > result) {
			result = (int) Math.pow(i++, 2); // ���� ���� ����
			if(m <= result && result <= n) { // n~m ���� �� ���
				if(min <= 0) { // ó���϶�
					min = result; // �ּڰ� ����
				}
				sum += result; // ���������� ��
			}
		}
		if(sum == 0) { // ������������ ���� 0�ϰ��, �������
			System.out.println(-1);
		} else { // ���
			System.out.println(sum);
			System.out.println(min);
		}
		

	}

}
