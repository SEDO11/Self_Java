package sec01.exam04;
//���ú���(��������)
public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 9; //int������ �ʱⰪ�� 15�� v1���� ����
		if(v1>10) { //���ǹ� v1�� 10 �̸��� �� ����
			
			int v2; //int���� v2���� ����
			v2= v1 - 10; //v2�� v1���� 10�� �� ���̴� ��� ����
		
		} // end if(v1>10), ���� �ȿ��� v2�� ����Ǿ����Ƿ� 14�ٿ� �ִ� v3���� ������ ���
		
			//int v3 = v1 + v2 + 5;

	}

}
