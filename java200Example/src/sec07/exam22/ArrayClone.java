package sec07.exam22;

import java.util.*;

public class ArrayClone {
	static Scanner sc = new Scanner(System.in);
	
	static int[] arrayClone(int[] a) { //�Ȱ��� �迭 ����� �޼ҵ�
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		return b;
	}
	
	static void printArr(int[] b) { //�迭 ��� �޼ҵ�
		for(int i=0; i<b.length; i++) {
			System.out.printf("b[%d] = %d\n", i, b[i]);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("��� ��: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = arrayClone(a);
		printArr(b);
		
	}

}
