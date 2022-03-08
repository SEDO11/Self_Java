package array.exam1546;

import java.util.Scanner;

public class Exam1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		int subSize = sc.nextInt(); // ���� ���� �Է�
		float[] score = new float[subSize]; //�迭 ���� (������)
		float[] newScore = new float[subSize];
		float sum = 0; // ���ο� ���� �� ����
		float max = 0; //�ִ��� �˱����� ����
		 
		for(int i=0; i<score.length; i++) { // ���� ���� �Է�
			score[i] = sc.nextFloat(); // ���� �� �Է� (�Ǽ���)
			if(max < score[i]) { // �ִ� ��
				max = score[i];
			}
		}
		
		for(int i=0; i<score.length; i++) { // ���ο� ���� ����
			newScore[i] = (score[i] / max) * 100;
			sum += newScore[i];
		}
		
		float avg = sum / score.length; // ���ο� ������ ���� ��� �� ����� ���
		System.out.println(avg); //���� ���
	}

}