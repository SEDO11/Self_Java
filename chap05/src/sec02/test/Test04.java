package sec02.test;
// for�� �̿��ؼ� �ִ�, �ּڰ� ���ϱ�
public class Test04 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2};
		int min = (array.length * array.length);
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println("�ִ�: " + max);
		System.out.println("�ּڰ�: " + min);
	}

}
