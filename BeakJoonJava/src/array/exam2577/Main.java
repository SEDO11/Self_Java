package array.exam2577;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		int[] arrCount = new int[10];
		int result = 1;
		int c = 2;
		
		//����� �迭 0���� �ʱ�ȭ
		for(int i=0; i<arrCount.length; i++) {
			arrCount[i] = 0;
		}
		
		//�� �ڸ��� �� �� �Է��� ����
		for(int i=0; i<arr.length; i++) {
			
			// �Է°� ���� �߰�, 100~1000����
			boolean run = true;
			do {
				arr[i] = sc.nextInt();
				if(arr[i] <= 1000 && arr[i] >= 100) {
					run = false;
				} else {
					System.out.println("�Է� ���� 100�̻� 1000 ���Ͽ��� �մϴ�.");
				}
			} while(run);
			result *= arr[i];
		}
		
		// ���� ���� �ڸ��� ���
		int leng = (int)(Math.log10(result)+1);
		
		//������� �̿�� ���� ���
		for(int i=0; i<leng; i++) {
			for(int j=0; j<10; j++) {
				if(result % 10 == j) {
					arrCount[j] += 1;
				}
			}
			result /= 10;
		}
		
		//���� ���� �� ���
		for(int i=0; i<arrCount.length; i++) {
			System.out.println(arrCount[i]);
		}

	}

}