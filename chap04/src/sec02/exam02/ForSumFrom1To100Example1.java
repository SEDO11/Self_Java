package sec02.exam02;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i=1; i<=100; i++) {
			sum += i;
		} //���⳻���� i�� 1~100�̴� 
		//����� �����鼭 i�� 100�� �ʰ��� 101�� �Ǹ鼭 �����Ƿ� 100�� ����� �ٶ� -1�� ���ش�
		System.out.println("1~" +(i-1) + "��: "+sum);
	}

}
