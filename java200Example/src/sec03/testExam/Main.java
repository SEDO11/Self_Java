package sec03.testExam;
//�� ������ �Ǳ� ������ �ű��ϴ� ������
public class Main {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int c = 5;
		
		System.out.println("a = b = c ���: " + (a = b = c));
		System.out.println("c = b = a ���: " + (c = b = a));
	}

}
