package chap06.sec04.exam03;

import java.util.*;

public class TestCarExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestCar myCar = new TestCar();
		
		System.out.print("���� �⸧ �ܷ��� �Է��ϼ���.> ");
		int gasIn = sc.nextInt();
		myCar.setGas(gasIn);
		
		System.out.println("���� ����մϴ�.");
		System.out.println();
		
		while(myCar.isLeftGas()) {
			myCar.run();
		}
		
		System.out.println("���� �� �̻� ������ �� �����ϴ�.");
	}

}
