package sec02.exam09;
//�� ������ and, or, xor
public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if((charCode>=65) & (charCode<=90)) { //���� false���� ���� ��� �� ������ Ȯ��
			System.out.println("�빮�� �̱���.");
		}
		
		if((charCode>=97) && (charCode<=122)) { //���� false�̸� �ڿ� �ִ� ��� ������ ��ŵ
			System.out.println("�ҹ��� �̱���.");
		}
		
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("�ҹ��� �̱���.");
		}
		
		int value = 6;
		
		if((value%2 == 0) | (value%3 == 0)) { //���� true���� ���� ��� �� ������ Ȯ��
			System.out.println("2 �Ǵ� 3�� ��� �̱���.");
		}
		
		if((value%2 == 0) || (value%3 == 0)) { //���� true�̸� �ڿ� �ִ� ��� ������ ��ŵ
			System.out.println("2 �Ǵ� 3�� ��� �̱���.");
		}

	}

}
