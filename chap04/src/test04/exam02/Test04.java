package test04.exam02;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("4x + 5y = 60�� �Ǵ� x�� y�� ��\n");
		int i=0;
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				int result = 4*x + 5*y;
				if(result == 60) {
					System.out.printf("(%1$d, %2$d)\n", x, y);
					i++;
				}
			}
		}
		System.out.println("\n���� ������ "+ i +"�� �Դϴ�.");

	}

}
