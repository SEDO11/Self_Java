package mersenne;

public class Main {
	public static void main(String[] args) 
	{
		/*
		1~100 ������ ���� �� �Ҽ��� ���Ͽ� ���
		�Ҽ����� �˻��Ͽ� �Ҽ����θ� �����ϴ� �޼ҵ带 ����
		*/
		for (int i = 2 ; i <= 100 ; i++ )
		{
			if (isPrime(i))
			{
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n){
		// �Ű������� ���� n�� �Ҽ����� ���θ� �˻��Ͽ� �����ϴ� �޼ҵ�
		int q;
		boolean chk = true;
		for (int i = 2; i < n ; i++ )
		{
			q = n % i;

			if (q == 0)
			{
				chk = false; // ������ ������ ��� �Ҽ��� �ƴ�.
				break;
			} else {
				chk = true; // ��� ���� �������� �� ������ �������� �ʴ´ٸ� �Ҽ�.
			}
		}
		return chk;
	}
}
