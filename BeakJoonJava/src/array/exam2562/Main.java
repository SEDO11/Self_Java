package array.exam2562;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�迭 ����
		int[] arr = new int[9];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//�ִ� ã��
		int result = arr[0];
		int resI = 0;
		for(int i=0; i<arr.length; i++) {
			if(result < arr[i]) {
				result = arr[i];
				resI = i+1;
			}
		}
		System.out.println(result);
		System.out.println(resI);
	}
}