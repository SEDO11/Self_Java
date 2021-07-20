package sec02.test;

import java.util.*;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1 ) { //1.�л���
				System.out.print("�л���> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				
			} else if(selectNo == 2 ) { //2.�����Է�
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = sc.nextInt();
				}
				
			} else if(selectNo == 3 ) { //3.��������Ʈ
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
				
			} else if(selectNo == 4 ) { //4.�м�
				int max = 0;
				double avg = 0.0;
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
				
			} else if(selectNo == 5 ) { //5.����
				System.out.println("�ý�������");
				run = false;
			} else {
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �������ֽʽÿ�.");
			}
		}
	}

}
