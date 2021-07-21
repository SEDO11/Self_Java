package sec02.test;

import java.util.*;

public class Test062 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				
			} else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = sc.nextInt();
				}
				
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
				
			} else if(selectNo == 4) {
				int sum = 0;
				int max = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					if(max<scores[i]) {
						max = scores[i];
					}
				}
				avg = (double) sum / scores.length;
				System.out.printf("�ְ� ����: %d\n", max);
				System.out.printf("��� ����: %f\n", avg);
				
			} else if(selectNo == 5) {
				System.out.println("���α׷� ����");
				run = false;
				
			} else {
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��Ͻʽÿ�.");
			}
			
		}

	}

}
