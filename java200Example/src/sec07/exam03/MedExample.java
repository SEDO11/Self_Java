package sec07.exam03;

import java.util.*;

public class MedExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x�� ��: ");
		int x = sc.nextInt();
		System.out.print("y�� ��: ");
		int y = sc.nextInt();
		System.out.print("z�� ��: ");
		int z = sc.nextInt();
		
		Med.med(x, y, z);

	}

}
