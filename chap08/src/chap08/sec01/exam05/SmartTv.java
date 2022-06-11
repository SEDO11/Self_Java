package chap08.sec01.exam05;

public class SmartTv implements RemoteControl, Searchable{ // ���� �������̽� ���� Ŭ����
	
	private int volume;
	
	@Override // Searchable �޼��� ������
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
		
	}
	
	@Override // RemoteControl �޼��� ������
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override // RemoteControl �޼��� ������
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override // RemoteControl �޼��� ������
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + this.volume);
	}
	
}
