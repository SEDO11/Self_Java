package chap06.sec04.exam02;

import java.util.*;

public class TestComputerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Computer myCom = new Computer();
		int[] arr = null;
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.�迭��ü���� | 2.�迭���ֱ� | 3.���� | 4.���� | 5.����");
			int selct = sc.nextInt();
			switch(selct) {
				case 1:
					System.out.println("��� �迭�� �����Ͻðڽ��ϱ�?");
					int arrLength = sc.nextInt();
					arr = new int[arrLength];
					break;
				case 2:
					for(int i=0; i<arr.length; i++) {
						System.out.printf("arr[%d]> ",i);
						int arrIn = sc.nextInt();
						arr[i] = arrIn;
					}
					break;
				case 3:
					int result1 = myCom.sum1(arr);
					System.out.println("��� �迭�� ��: " + result1);
					break;
				case 4:
					long result2 = myCom.mul(arr);
					System.out.println("��� �迭�� ��: " + result2);
					break;
				default:
					run = false;
					break;
			}
		}
		System.out.println("�ý��� ����");
	}

}
