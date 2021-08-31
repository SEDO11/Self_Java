package sec07.exam20;

import java.util.*;

public class AryIns {
	static Scanner sc = new Scanner(System.in);
	static private int idx;
	
	static void aryIns(int[] a, int idx, int x) {
		
		// å�� �ִ� �ڵ�
		for(int i=a.length-1; i > idx; i--) {
			a[i] = a[i-1];
		}
		a[idx] = x;
		
		/* ���� �� �ڵ�
		for(int i=a.length-1; i>=idx; i--) {
			if(i != idx) {
				a[i] = a[i-1];
			} else {
				a[i] = x;
			}
		}
		*/
	}
	
	static void arrPrint(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d]: %d\n", i,a[i]);
		}
	}
	
	static void arrMake(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d]: ", i);
			a[i] = sc.nextInt();
		}
	}
	
	static void arrLength(int[] a) {
		boolean run = true;
		int idx = 0;
		while(run) {
			idx = sc.nextInt();
			if(0 <= idx && idx < a.length) {
				AryIns.idx = idx;
				run = false;
			} else {
				System.out.printf("�迭 ������ ������ϴ�. \n�ٽ� �Է� ���ּ���.: ");
			}
		}
	}

	public static void main(String[] args) {
		int[] a;
		System.out.printf("��� ��: ");
		int n = sc.nextInt();
		a = new int[n];
		
		arrMake(a);
		arrPrint(a);
		System.out.printf("������ ����� �ε���: ");
		arrLength(a);
		System.out.printf("������ ��: ");
		int x = sc.nextInt();
		aryIns(a, idx, x);
		arrPrint(a);
	}

}