package sec02.exam06;
//���ڿ� ���� ������
public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; //���ڰ� ó���� ����Ǹ鼭 ���ڰ��տ����̵�
		String str2 = str1 + "Ư¡"; //���ڰ� ó���� ����Ǹ鼭 ���ڰ��տ����̵�
		System.out.println(str2); //���ڰ����̵� ������ ����� ��
		
		String str3 = "JDK" + 3 + 3.0; //���ڰ� ó���� ����Ǹ鼭 ���ڰ��տ����̵�
		String str4 = 3 + 3.0 + "JDK"; //ó���� 3 + 3.0�� ��Ģ�������� ����Ǿ� 6.0�� �ǰ�
		//JDK�� �����̱� ������ 6.0 + "JDK"�� ���ڰ��տ����� �ȴ�
		System.out.println(str3);
		System.out.println(str4);

	}

}
