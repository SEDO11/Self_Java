package sec03;

import java.util.*;

public class Exam18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[2]; 
		for(int i=0; i<2; i++) {
			arr[i] = sc.nextInt();
		}
		// ���� ���������� �� ���� int���� ����ϸ� ������ �߻��ϹǷ� Integer�� �ٲپ ���ش�.
		Arrays.sort(arr, Collections.reverseOrder()); // ���� ��������
		System.out.println(arr[0]+ " " + arr[1]);
	}
	
}
