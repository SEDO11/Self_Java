package sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { //¦���� �ƴҶ� 
				continue; //for�� �ǵ��ư��� �ٽ� ����,
						 // Ȧ���� ������ �������� ���ϸ鼭 ��� x
			}
			System.out.println(i); //¦���� ���
		}

	}

}
