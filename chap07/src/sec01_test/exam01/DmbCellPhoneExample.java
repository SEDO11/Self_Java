package sec01_test.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// �ڽ� ��ü�� ������ �� �θ� ��ü�� ���� �����ǰ� �� ���� �ڽ� ��ü�� ����
 		DmbCellPhone dcp = new DmbCellPhone("java", "black", 10);
		System.out.println(dcp.model);
		System.out.println(dcp.color);
		System.out.println(dcp.channel);
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("��������");
		dcp.receiveVoice("���� ȫ�浿�Դϴ�.");
		dcp.sendVoice("�ݰ����ϴ�.");
		dcp.hangUp();
	}

}
