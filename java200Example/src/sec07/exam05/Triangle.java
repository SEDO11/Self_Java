package sec07.exam05;

public class Triangle {

	static void putChar(int n, char c) {
		for(int i=0; i<=n; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	static void putStart(int n) {
		System.out.println("*�� �̿��� �ﰢ�� �����");
		if(n<=0) {
			System.out.println("�Էµ� ���� 0 ���� �Դϴ�.");
		}
		for(int i=0; i<n; i++) {
			putChar(i, '*');
		}
	}
}