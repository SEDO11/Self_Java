package python_learn;

import java.util.Scanner;

public class Exam7567 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = 10; // �׸��� ���� ���� ����, �ʱⰪ 10
		
		// �� ���� �� �ڸ���
		String[] strArray = str.split("");
		
		for(int i=1; i<strArray.length; i++) { // ���ڿ��� ���� ��ŭ �ݺ�
			if(strArray[i].equals(strArray[i-1])) { // �׸��� ���� ���� ���� ������� �������
				len += 5;
			} else { // �ٸ� ������� ���� ���
				len += 10;
			}
		}
		
		System.out.println(len);

	}

}
