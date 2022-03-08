package array.exam8958;

import java.util.*;

public class Exam8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		int intNum = Integer.parseInt(num);
		String[] test = new String[intNum]; // �迭 ���� �Է� �� �迭 ����
		int[] result = new int[intNum];
		
		for(int i=0; i<intNum; i++) {
			test[i] = sc.nextLine(); // ox ��� �Է�
			String[] strArray = test[i].split(""); //�񱳸� ���� �ϳ��� �ڸ���
			int count = 0;
			int sum = 0;
			
			for(int j=0; j<strArray.length; j++) {
				if(strArray[j].equals("O") || strArray[j].equals("o")) {
					sum += ++count;
				} else {
					count = 0;
				}
			}
			result[i] = sum;
		}
		
		for(int i=0; i<intNum; i++) {
			System.out.println(result[i]);
		}

	}

}