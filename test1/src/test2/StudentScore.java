package test2;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = null;
		int sum = 0;
		float avg = 0.0f;
		boolean run = true;
		
		while(run) {
			println("-------------------------------------------");
			println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			println("-------------------------------------------");
			
			String select = sc.nextLine();
			
			switch(select) {
				case "1":
					println("�л����� �Է��ϼ���");
					String student = sc.nextLine();
					int stuNum = Integer.parseInt(student);
					score = new int[stuNum];
					break;
				case "2":
					println("������ �Է��ϼ���");
					for(int i=0; i<score.length; i++) {
						print((i + 1) + " �� �л� ���� �Է�: ");
						String scores = sc.nextLine();
						score[i] = Integer.parseInt(scores);
					}
					break;
				case "3":
					println("�л� ���� ����Ʈ");
					for(int i=0; i<score.length; i++) {
						println((i + 1) + " �� �л� ����: " + score[i]);
					}
					break;
				case "4":
					println("�м�");
					int max = score[0];
					for(int i=0; i<score.length; i++) {
						sum += score[i];
						if(max < score[i]) {
							max = score[i];
						}
					}
					avg = (float) sum / score.length;
					println("�ְ� ����: " + max);
					println("��� ����: " + avg);
					break;
				case "5":
					println("�ý����� �����մϴ�.");
					run = false;
					break;
				default:
					println("�߸� �� �����Դϴ�.");
					
			}
		}

	}
	
	public static void println(String result) {
		System.out.println(result);
	}
	
	public static void print(String result) {
		System.out.print(result);
	}

}
