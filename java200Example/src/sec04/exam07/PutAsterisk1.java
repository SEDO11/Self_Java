package sec04.exam07;

import java.util.*;

public class PutAsterisk1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("*�� �� �� ǥ���ұ��?: ");
		int x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
