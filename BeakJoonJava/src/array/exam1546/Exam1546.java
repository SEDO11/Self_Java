package array.exam1546;

import java.util.Scanner;

public class Exam1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		// ���� ���� �Է�
		int subSize = sc.nextInt(); //�Է�
		float[] subject = new float[subSize]; //�迭 ����
		float max = subject[0];
		
		// ���� ���� �Է�
		for(int i=0; i<subject.length; i++) {
			subject[i] = sc.nextInt(); // ���� �� �Է�
		}
		
//		while(run) {
//			int i = 0;
//			if(i >= subject.length) {
//				run = false;
//			} else {
//				if(max < subject[i]) {
//					max = subject[i];
//					i++;
//				}
//			}
//		}
		
		//���� ���
		for(int i=0; i<subject.length; i++) {
			System.out.println(subject[i]);
		}
		//�ִ�
		System.out.printf("\n�ִ밪: " + max);
	}

}
