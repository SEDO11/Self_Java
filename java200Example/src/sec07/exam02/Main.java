package sec07.exam02;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x�� ��: ");
		int x = sc.nextInt();
		System.out.print("y�� ��: ");
		int y = sc.nextInt();
		System.out.print("z�� ��: ");
		int z = sc.nextInt();
		
		Min.min(x, y, z);
	}

}
