package sec07.exam212;

import java.util.*;

public class AryExchngExample extends AryExchng{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a;
		int[] b;
		String arrA = "a";
		String arrB = "b";
		
		System.out.printf("�迭 %s�� ��� ��: ", arrA);
		int x = sc.nextInt();
		a = new int[x];
		arr(a, arrA);
		
		System.out.printf("�迭 %s�� ��� ��: ", arrB);
		int y = sc.nextInt();
		b = new int[y];
		arr(b, arrB);
		
		System.out.println("��ȯ ��");
		arrPrint(a, arrA);
		arrPrint(b, arrB);
		
		aryExchng(a, b);
		
		System.out.println("��ȯ ��");
		arrPrint(a, arrA);
		arrPrint(b, arrB);
	}
}
