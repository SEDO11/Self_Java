package banking2;

public class Account {
	// �ʵ�
	private String ano;// ���¹�ȣ
	private String owner;// ������
	private int pw;// ��й�ȣ
	private int balance;// �ܰ�
	
	// ������
	public Account(String ano, String owner, int pw, int balance) {
		// super();//=> Account extends Object
		this.ano = ano;
		this.owner = owner;
		this.pw = pw;
		this.balance = balance;
	}

	// �޼ҵ�
	protected String getAno() {
		return ano;
	}

	protected void setAno(String ano) {
		this.ano = ano;
	}

	protected String getOwner() {
		return owner;
	}

	protected void setOwner(String owner) {
		this.owner = owner;
	}

	protected int getPw() {
		return pw;
	}

	protected int getBalance() {
		return balance;
	}

	protected void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public int withdraw(int amount) throws Exception {// ���� ó���� ȣ���� ������ ���ѱ�
		if (this.balance < amount) { // ���� ���� ó��
			throw new Exception("�ܾ��� ���ڶ��ϴ�.");
			// new Exception() ���ܰ�ü ����
			// throw:������ ���� ��ü�� ȣ���� ���� �ѱ�
			// �޼ҵ��� �Ű����� ���� �ִ� throws Exception�� ȣ���� ������ ���ܸ� �ѱ�� ����
			// �� ������ ������ ȣ���� �������� ���� ó���� �������.
		} else { // this.balance>=amount
			this.balance -= amount;

			return amount;
		}
	}
}