package sec03;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int point = sc.nextInt();
		
		if(point >= 80 && point <= 100) {
			print("��");
		} else if(point >= 70) {
			print("��");
		} else if(point >= 60) {
			print("��");
		} else if(point >= 50) {
			print("��");
		} else {
			print("��");
		}

	}
	
	public static void print(String s) {
		System.out.println(s);
	}

}
