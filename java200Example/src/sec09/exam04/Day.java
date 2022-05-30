package sec09.exam04;

public class Day {
	//�ʵ�
	private int year = 1; // ��
	private int month = 1; // ��
	private int date = 1; // ��
	
	//������
	public Day() {};
	public Day(int year) {
		this.year = year;
	};
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}
	
	//�޼ҵ�
	//��, ��, �� �ҷ�����
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}
	
	//��, ��, �� ����
	public void setDate(int date) {
		this.date = date;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// ���� ã��
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m==1 || m==2) {
			y--;
			m+=12;
		}
		return (y+y/4-y/100+y/400+(13*m+8)/5+date)%7;
	}
	
}
