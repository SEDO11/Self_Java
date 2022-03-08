package if_.exam2480;

import java.util.*;

public class Exam2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dice = sc.nextLine(); // �ֻ��� �� �Է�
		String[] strDice = dice.split(" "); // ������ �ֻ��� ���� ������
		int[] intDice = new int[strDice.length];
		int result = 0;
		
		for(int i=0; i<strDice.length; i++) { // �ֻ��� ���� ���������� �ٲ�
			intDice[i] = Integer.parseInt(strDice[i]);
		}
		
		if(intDice[0] == intDice[1] && intDice[0] == intDice[2]) { //��δ� ���� ���
			result = 10000+intDice[0]*1000;
		} else if(intDice[0] == intDice[1] || intDice[0] == intDice[2]) { // �ΰ��� �ֻ����� �������
			result = 1000+intDice[0]*100;
		} else if(intDice[1] == intDice[2]) { // �ΰ��� �ֻ����� �������
			result = 1000+intDice[1]*100;
		} else { // �ֻ����� ������ ���� ���
			Arrays.sort(intDice);
			result = intDice[2]*100;
		}
		
		System.out.println(result); //��� ���
		
	}

}