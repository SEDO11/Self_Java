package sec02.test;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù ��° ��: ");
		String stringNumber1 = scanner.nextLine();
		System.out.print("�� ��° ��: ");
		String stringNumber2 = scanner.nextLine();
		
		double doubleNumber1 = Double.parseDouble(stringNumber1);
		double doubleNumber2 = Double.parseDouble(stringNumber2);
		
		if(doubleNumber2 == 0.0) { //�и� �ش��ϴ� ���ڰ� 0�϶�
			System.out.println("���Ѵ� �Դϴ�.");
		}
		
		else {
			double result = doubleNumber1 / doubleNumber2; //0�� �ƴҶ��� ����� ���
			System.out.printf("���: %.2f", result);
		}

	}

}
