package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		
		//����
		char c1 = 'A'; //char Ÿ���� ���ڸ� �ʱ�ȭ �� �� ���� ����ǥ ' '�� ����
		// �����ڵ带 ���� �ϴ� ���� �׳� �˾Ƶδ� �͸� ����, ���� �Ⱦ��ٰ� �Ѵ�.
		char c2 = 65; //65�� ��ȣ�� ���� �ִ� �����ڵ� ���ڸ� ���
		char c3 = '\u0041'; //16������ ǥ���� �����ڵ带 c3�� �ʱ�ȭ, ������ ���� �� ���ٰ� ��
							//0041 = 0 + 0 +64(16*4) + 1 = 65
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//�ѱ�
		char c4 = '��';
		char c5 = 44032;
		char c6 = '\uAC00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		

	}

}
