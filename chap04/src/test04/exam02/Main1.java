package test04.exam02;
// 2������, 1~100�� �����߿��� 3�� ����� ���ձ��ϱ�
public class Main1 {
	public static void main(String[] args) {
		int i;
		int result = 0;
		for(i=1; i<=100; i++) {
			if(i%3==0) {
				result += i;
			}
		}
		System.out.println("1~" + (i-1) +"�� �����߿��� 3�� ����� ����: " + result);
	}
}
