package sec01.exam04;
//������ ������� ���� �ذ��ϱ�
public class Test1 {

	public static void main(String[] args) {
		
		int v1 = 11;
		int v2;
		
		if(v1>10) {
			v2 = v1 - 10;
			System.out.println("v1 = " + v1);
			System.out.println("v2 = v1 - 10");
			System.out.println("v1 - 10 = " + v2);
		}
		
		else
		{
			v2 = 5;
			int v3;
			v3 = v1 + v2 + 5;
			System.out.println("v1 = " + v1);
			System.out.println("v2 = " + v2);
			System.out.println("v3 = v1 + v2 + 5");
			System.out.println("v3 = " + v3);
		}

	}

}
