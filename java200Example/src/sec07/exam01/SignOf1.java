package sec07.exam01;

import java.util.*;

public class SignOf1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SignOf signof = new SignOf();
		
		System.out.print("������ �Է�: ");
		int x = sc.nextInt();
		
		int result = signof.signOf(x);
		System.out.println(result);
		
	}

}
