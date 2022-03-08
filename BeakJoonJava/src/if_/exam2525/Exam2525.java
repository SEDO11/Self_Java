package if_.exam2525;

import java.util.Scanner;

public class Exam2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String time = sc.nextLine(); // ��, �� �Է�
		int timeSet = sc.nextInt(); // ��� �ð� �Է�
		String[] strTime = time.split(" "); // ��, ���� ���� ����
		int [] intTime = new int[strTime.length]; // �ð� ����� ���� ���� ��, ���� ���������� ��ȯ
		int mTot = 0; // �� ����
		int hTot = 0; // �� ����
		int hPlus = 0; // 60���� ���� ��� 1�ð��� �߰��ϱ� ���� ����
		
		for(int i=0; i<strTime.length; i++) {// �Էµ� ���ڿ� �ð��� ���������� ��ȯ
			intTime[i] = Integer.parseInt(strTime[i]);
		}
		
		mTot = intTime[1] + timeSet; //��, ���� ����
		if(mTot >= 60) { //���� 60���� ���� ��� ��ȯ
			hPlus = mTot / 60; // �� ���ϱ�, �ð� �߰�
			mTot %= 60; // ������ ���ϱ�, ��
		}
		
		hTot = intTime[0] + hPlus; // �ð�, ���� ����
		if(hTot >= 24) { // �ð��� 24�ð� ���� ��� ��ȯ
			hTot %= 24;
		}
		String result = hTot + " " + mTot;
		
		System.out.println(result); //�ð�, �� ���
	}

}