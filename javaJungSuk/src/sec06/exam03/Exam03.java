package sec06.exam03;

public class Exam03 {
	String name; // �л��̸�
	int ban; // ��
	int no; // ��ȣ
	int kor; // ��������
	int eng; // ��������
	int math; // ��������
	
	// �޼���
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		return Math.round((getTotal() / 3f) * 100)/100f;
	}
}
