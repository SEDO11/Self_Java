package python_learn;

import java.util.Scanner;

public class Exam3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x[] = new int[3]; // �Է� ���� x��ǥ 3��
		int y[] = new int[3]; // �Է� ���� y��ǥ 3��
		int dx, dy; // ���� ���� x, y ��ǥ ���� ���� ����
		
		for(int i=0; i<x.length; i++) { // x, y ��ǥ �Է�
			String str = sc.nextLine();
			String[] arr = str.split(" "); // ���ٷ� x y ��ǥ �Է��� �ޱ� ���� ���ڿ��� ���� �� ������ �������� ������ �� ����
			x[i] = Integer.parseInt(arr[0]);
			y[i] = Integer.parseInt(arr[1]);
		}
		
		// index 0, 1�� ���� ���� �� t = index 2 / f t = index 0, f f = index 1
		dx = (x[0] == x[1]) ? x[2] : (x[1] == x[2]) ? x[0] : x[1]; 
		dy = (y[0] == y[1]) ? y[2] : (y[1] == y[2]) ? y[0] : y[1];
		
		System.out.printf("%d %d", dx, dy);
	}

}
