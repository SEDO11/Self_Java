package test.sec04.exam01;

public class Calculator {
	//�ʵ�
	//������
	//�޼ҵ�
	int plus(int x, int  y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int  y) {
		int result = plus(x, y) / 2; //plus() �޼ҵ� ȣ��
		return result; 
	}
	
	void execute() {
		double result = avg(7, 10); //avg() �޼ҵ� ȣ��
		println("���: "+result); //println() �޼ҵ� ȣ��
	}
	
	void println(String result) {
		System.out.println(result);
	}
}
