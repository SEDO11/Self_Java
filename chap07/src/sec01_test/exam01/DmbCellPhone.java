package sec01_test.exam01;

public class DmbCellPhone extends CellPhone{ // dmb ��� ���� �޴���
	// �ʵ�
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel) {
		super(); // �θ� Ŭ������ ������ ����, �̰� �Ƚᵵ �����ϸ� �ڵ����� �����ȴ�.
		this.model = model; // �θ� Ŭ������ ���� �������� �ʵ�
		this.color = color; // �θ� Ŭ������ ���� �������� �ʵ�
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� "+channel+"�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��"+channel+"������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
