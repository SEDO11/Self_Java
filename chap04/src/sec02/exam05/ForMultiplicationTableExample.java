package sec02.exam05;
//for���� �̿��� ������
public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int n=2; n<=9; n++) {
			System.out.println("*** " + n +"�� ***");
			for(int m=1; m<=9; m++) {
				System.out.println(n + "x" + m + "=" + (n*m));
			}
		}

	}

}
