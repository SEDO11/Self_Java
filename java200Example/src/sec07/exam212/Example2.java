package sec07.exam212;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a;
		int[] b;
		String arrA = "a";
		String arrB = "b";
		
		System.out.printf("�迭 %s�� ��� ��: ", arrA);
		int x = sc.nextInt();
		a = new int[x];
		AryExchng.arr(a, arrA);
		
		System.out.printf("�迭 %s�� ��� ��: ", arrB);
		int y = sc.nextInt();
		b = new int[y];
		AryExchng.arr(b, arrB);
		
		System.out.println("��ȯ ��");
		AryExchng.arrPrint(a, arrA);
		AryExchng.arrPrint(b, arrB);
		
		AryExchng.aryExchng(a, b);
		
		System.out.println("��ȯ ��");
		AryExchng.arrPrint(a, arrA);
		AryExchng.arrPrint(b, arrB);
	}
}
