package test04.exam02;
//�� �ֻ����� ���� 5�϶� ����
public class Main3 {

	public static void main(String[] args) {
		int result = 0;
		
		while(result != 5) {
			int dice1 = (int) (Math.random()*6) + 1;
			int dice2 = (int) (Math.random()*6) + 1;
			result = dice1 + dice2;
			System.out.printf("(%1$d, %2$d) �ֻ��� ���� ��: %3$d\n", dice1, dice2, result);
		}
		
		System.out.println("\n�� �ֻ����� ���� 5�� ��찡 ���Խ��ϴ�. \n�ý����� �����մϴ�.");
	}

}