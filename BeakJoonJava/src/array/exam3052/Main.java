package array.exam3052;

import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrVar = 10;
		
		int[] arr = new int[arrVar];
		int[] arrResult = new int[arrVar]; //��������
		
		//�Է�
		for(int i=0; i<arr.length; i++) {
			
			// �Է°� ���� �߰�, 0~1000����
			boolean run = true;
			do {
				arr[i] = sc.nextInt();
				if(arr[i] <= 1000 && arr[i] >= 0) {
					run = false;
				} else {
					System.out.println("�Է� ���� 0�̻� 1000 ���Ͽ��� �մϴ�.");
				}
			} while(run);
		}
		
		//��������
		for(int i=0; i<arr.length; i++) {
			arrResult[i] = arr[i] % 42;
		}
		
		ArrayList<Integer> list = new ArrayList<>(); 
		for(int checkData : arrResult) { 
			if(!list.contains(checkData)) { 
				//����Ʈ�� contains �޼��带 Ȱ���� 
				//����Ʈ ������ �����͸� üũ�� ����. 
				//���� �ߺ� �����Ͱ� ���� ��� �� ���� 
				// add �� ���� �־��ش�. 
				list.add(checkData); 
			} 
		}
		
		int [] newArr = new int [list.size()]; 
		// list�� ũ�� ��ŭ ���ο� �迭�� �������ش�. 
		for(int i = 0; i < newArr.length; i++ ) {
			newArr[i] = list.get(i); 
		} 
		// get�� ���� �ߺ����� �����ϰ� ������ �迭�� 
		// �ϳ��� �־��ش�. 
		
		//���� ���� �� ���
		System.out.println(newArr.length);
	}

}