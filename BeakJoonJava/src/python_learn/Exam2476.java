// �ֻ��� ����
package python_learn;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int run = Integer.parseInt(sc.nextLine()); // ���� Ƚ��
		int[] arr = new int[run]; // ���� ������ �迭 ����
		
		
		for(int i=0; i<run; i++) {
			String str = sc.nextLine();
			String[] strArr = str.split(" ");
			int a = Integer.parseInt(strArr[0]);
			int b = Integer.parseInt(strArr[1]);
			int c = Integer.parseInt(strArr[2]);
			
			if(a == b && b == c) { // ���� �� ���� ���� ���
				arr[i] = a * 1000 + 10000;
			} else if(a == b || a == c) { // ���� �� ���� ���� ���
				arr[i] = a * 100 + 1000;
			} else if(b == c) { // ���� �� ���� ���� ���
				arr[i] = b * 100 + 1000;
			} else {
				int max = (a < b) ? ((b < c) ?  c : b) : ((c < a) ?  a : c); // ���� ū �� ��
				arr[i] = max * 100;
			}
		}
		
		Arrays.sort(arr); // �������� ����
		System.out.println(arr[run-1]); // �� �ڿ� ���� ���� ū ���̹Ƿ� �� ���� �� ���
	}

}
