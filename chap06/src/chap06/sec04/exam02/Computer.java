package chap06.sec04.exam02;

public class Computer {
	//�ʵ�
	//������
	//�޼ҵ�
	int sum1(int[] values) { //�迭�� ��Ҹ� ��� ���� ���� ����
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	long mul(int[] values) {
		long mul = 1L;
		for(int i=0; i<values.length; i++) {
			mul *= values[i];
		}
		return mul;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
