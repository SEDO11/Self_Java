package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		System.out.println("[������ �迭]");//������ �迭
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			//ó���� �迭�� ������ �� �ƹ����� ���� �ʾ����Ƿ� ��� 0���� �ʱ�ȭ ��
			System.out.printf("arr[%1$d]: %2$d\n",i ,arr1[i]);
		}
		System.out.println("");
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			//�� �迭�� �־��� ���� ��µ�
			System.out.printf("arr[%1$d]: %2$d\n",i ,arr1[i]);
		}
		System.out.println("");
		
		System.out.println("[�Ǽ��� �迭]");//�Ǽ��� �迭
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			//ó���� �迭�� ������ �� �ƹ����� ���� �ʾ����Ƿ� ��� 0���� �ʱ�ȭ ��
			System.out.printf("arr[%d]: %.2f\n",i ,arr2[i]);
		}
		System.out.println("");
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			//ó���� �迭�� ������ �� �ƹ����� ���� �ʾ����Ƿ� ��� 0���� �ʱ�ȭ ��
			System.out.printf("arr[%d]: %.2f\n",i ,arr2[i]);
		}
		System.out.println("");
		
		System.out.println("[���ڿ� �迭]");//���ڿ� �迭
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			//ó���� �迭�� ������ �� �ƹ����� ���� �ʾ����Ƿ� ��� 0���� �ʱ�ȭ ��
			System.out.printf("arr[%d]: %s\n",i ,arr3[i]);
		}
		System.out.println("");
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		for(int i=0; i<3; i++) {
			//ó���� �迭�� ������ �� �ƹ����� ���� �ʾ����Ƿ� ��� 0���� �ʱ�ȭ ��
			System.out.printf("arr[%d]: %s\n",i ,arr3[i]);
		}
	}

}
