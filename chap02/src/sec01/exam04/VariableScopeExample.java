package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 9; //int������ �ʱⰪ�� 15�� v1���� ����
		int v2;
		if(v1>10) { //���ǹ� v1�� 10 �̸��� �� ����
			//int v2; //int���� v2���� ����, �ٵ� ���⿡ v2�� �����ϸ� v3���� ������ �߱� ������ 
					//�ۿ��ٰ� ������ �����ؾ� �Ѵ�.
			v2= v1 - 10; //v2�� v1���� 10�� �� ���̴� ��� ����
			int v3 = v1 + v2 + 5; //
			System.out.println(v3);
		}
		
		else
		{
			v2 = 3;
			int v3 = v1 + v2 + 5; //
			System.out.println(v3);
		}
	}

}
