package sec09.exam03;

import java.util.*;

public class HumanArrayTester {

	static void printHumanArray(Human[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.printf("�̸�: %s, Ű: %d, ������: %d\n", a[i].getName(), a[i].getHeight(), a[i].getWeight());
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		//1���� �迭
		Human[] p = {
				new Human("ö��", 170, 70),
				new Human("�浿", 160, 59),
		};
		
		System.out.print("�迭 q�� ��� ��: ");
		n = sc.nextInt();
		
		Human[] q = new Human[n];
		for(int i=0; i<q.length; i++) {
			System.out.printf("q[%d]",i);
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("����: ");
			int height = sc.nextInt();
			System.out.print("ü��: ");
			int weight = sc.nextInt();
			q[i] = new Human(name, height, weight);
		}
		
		//2���� �迭
		Human[][] x = {
				{
					new Human("��ö��", 175, 52), new Human("��ö��", 175, 52)
				},
				{
					new Human("ȫ�浿", 175, 52), new Human("������", 175, 52)
				},
				{
					new Human("����", 175, 52), new Human("����", 175, 52)
				}
		};
		
		System.out.print("�迭 y�� �� ��: ");
		int y1 = sc.nextInt();
		System.out.print("�迭 y�� �� ��: ");
		int y2 = sc.nextInt();
		
		Human[][] y = new Human[y1][y2];
			
		for(int i=0; i<y.length; i++) {
			for(int j=0; j<y[i].length; j++) {
				System.out.printf("y[%d]",i);
				System.out.printf("y[%d]",j);
				String name = sc.next();
				int height = sc.nextInt();
				int weight = sc.nextInt();
				y[i][j] = new Human(name, height, weight);
			}
		}
		
		System.out.println("�迭p");
		printHumanArray(p);
		System.out.println("�迭q");
		printHumanArray(q);
		System.out.println("�迭x");
		for(int i=0; i<x.length; i++) {
			printHumanArray(x[i]);
		}
		System.out.println("�迭y");
		for(int i=0; i<y.length; i++) {
			System.out.printf("%d ��\n", i);
			printHumanArray(y[i]);
		}

	}

}
