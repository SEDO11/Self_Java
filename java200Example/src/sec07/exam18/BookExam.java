package sec07.exam18;
//�̰͵� ��
import java.util.*;

public class BookExam {

	static void aryRmv(int[] a, int idx) {
		if(idx>=0 && idx < a.length) {
			for(int i = idx; i < a.length-1; i++) {
				a[i] = a[i + 1];
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ��: ");
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.printf("a[%d]: ", i);
			a[i] = sc.nextInt();
		}
		
		System.out.print("������ ����� �ε���: ");
		int idx = sc.nextInt();
		
		aryRmv(a, idx);
		for(int i=0; i< num; i++) {
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}

	}

}