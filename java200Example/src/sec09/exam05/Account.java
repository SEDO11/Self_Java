package sec09.exam05;

public class Account {
	private String name;
	private String no;
	private long balance;
	private Day date;
	
	// ������
	Account(String n, String num, long z, Day d) {
		name = n;
		no = num;
		balance = z;
		date = new Day(d);
	}
	
	//���� ���� Ȯ��
	public String getName() {
		return name;
	}
	
	//���� ��ȣ Ȯ��
	public String getNo() {
		return no;
	}
	
	//���� �ܰ� Ȯ��
	public long getBalance() {
		return balance;
	}
	
	public Day date() {
		return new Day(date);
	}
	
	//k�� �Ա�
	void deposit(long k) {
		balance += k;
	}
	
	//k�� ���
	void withdraw(long k) {
		balance -= k;
	}
	
	//
	public String toString() {
		return "{"+name+", "+no+", "+balance+"}";
	}
	
}
