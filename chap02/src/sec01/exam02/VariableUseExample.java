package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		//�鿩���� �� ���� tap�� ������
		int hour = 3; //������ �ҹ��ڷ�
		int minute = 5;
		System.out.println(hour + "�ð�" + minute + "��");
		
		int totalMinute = (hour*60) + minute; //�� ���ڰ� ������ ��쿡�� ���ڸ��� �빮�ڷ� ����
		System.out.println("��" + totalMinute + "��");
	}

}
