package sec06.exam15;
// �� ���� �ش��ϴ� ���� �ܾ� �н� ���α׷� 

import java.util.*;

public class MonthCAI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] month = {"January", "February", "March", "April", "May"
				, "June", "July", "August", "September", "October", "November", "December"};
		boolean run = true;
		int rd = (int) (Math.random() * 11);  //1~12������ ���� ���
		System.out.println("������ �����ϰڽ��ϴ�.");
		
		while(run) {
			System.out.printf("%d��: ", rd+1);
			String monthIn = sc.nextLine();
			
			if(monthIn.equals(month[rd]) || monthIn.equals(month[rd].toUpperCase()) || monthIn.equals(month[rd].toLowerCase())){
				System.out.println("��: " + month[rd] + " �����Դϴ�.");
				rd = (int) (Math.random() * 11); // 1~12������ ���� ���
				System.out.println("����Ͻðڽ��ϱ�? 1.��, 2.�ƴϿ�");
				String selct = sc.nextLine();
				if (selct.equals("1")) {
				} else {
					run = false; // break;
				}	
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ");
			}
		}
		System.out.println("���α׷��� ���� �մϴ�. ");
	}

}