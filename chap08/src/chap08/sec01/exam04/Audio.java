package chap08.sec01.exam04;

public class Audio implements RemoteControl{ // �������̽��� ����ϴ� ���� Ŭ����
	private int volume; // �ʵ�
	
	@Override // �߻� �޼��� ������
	public void turnOn() {
		System.out.println("������� �մϴ�.");
		
	}

	@Override // �߻� �޼��� ������
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
		
	}

	@Override // �߻� �޼��� ������
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� ����� ����: " + this.volume);
	}
	
}