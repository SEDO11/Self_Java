package chap08.sec01.exam04;

public interface RemoteControl { // �������̽�
	//���
	/*public static final �������̽������� �̰� ���ۼ� ���൵ �� */
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	/*public abstract �� ���� ������*/
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
