package sec08.exam03;

import java.util.*;

public class CarTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car myCar = new Car("�Ÿ", "12��3456", 80, 100, 200, 500, 1000, 200, 5, 140);
		boolean run = true;
		
		while(run) {
			System.out.println("1.���� x��ǥ | 2.���� y��ǥ | 3.x��ǥ �̵� | 4.y��ǥ �̵� | 5.���� ���� "
					+ "| 6.���� | 7. �ڵ��� ���� | 8. ����");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				myCar.getX();
				break;
			case 2:
				myCar.getY();
				break;
			case 3:
				double x = sc.nextDouble();
				myCar.setXMove(x);
				run = myCar.getFuelRemain();
				break;
			case 4:
				double y = sc.nextDouble();
				myCar.setYMove(y);
				run = myCar.getFuelRemain();
				break;
			case 5:
				myCar.getFuelRemain();
				break;
			case 6:
				double oil = sc.nextDouble();
				myCar.setFuelRemain(oil);
				break;
			case 7:
				myCar.spec();
				break;
			default:
				run = false;
				break;
			}
				
		}
		System.out.println("�õ��� �������ϴ�.");
	}

}
