package sec06.exam04;

public class Exam04 {
	String name; // �л��̸�
	int ban; // ��
	int no; // ��ȣ
	int kor; // ��������
	int eng; // ��������
	int math; // ��������
	
	//������
	public Exam04(String n, int b, int no, int k, int e, int m) {
		name = n;
		ban = b;
		this.no = no;
		kor = k;
		eng = e;
		math = m;
	}
	
	// �޼���
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		return Math.round((getTotal() / 3f) * 100)/100f;
	}
	
	public String info() {
		return name +"," + ban +"," + no +"," + kor +"," + eng +"," + math;
	}
}
