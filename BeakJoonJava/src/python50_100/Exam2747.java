//�Ǻ���ġ ��
package python50_100;

import java.util.Scanner;

public class Exam2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1]; // �Ǻ���ġ ������ 10�� �Է��ϸ� 0~10���� 11���� ����ϹǷ� +1 ����
		for(int i=0; i<arr.length; i++) {
			if(i < 2) {
				arr[i] = i;
			} else {
				arr[i] += arr[i-1] + arr[i-2];
			}
		}
		System.out.println(arr[n]);

	}

}
