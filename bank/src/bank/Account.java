package bank;

public class Account {
	private String name; // ���̸�
	private int cashId; // ����� ���¹�ȣ
	private int pwd; // ����� ��й�ȣ
	private int money; // �ܾ�
	
	Account() {
		
	}
	
	Account(String name, int cashId, int pwd){
		this.name = name;
		this.cashId = cashId;
		this.pwd = pwd;
	}
	
	int getIdCheck() { // ���¹�ȣ Ȯ���� ���� �޼ҵ�
		return this.cashId;
	}
	
	int getPwdCheck() {
		return this.pwd;
	}
	
	void nameIdPrint() { // �̸��� ���� ��ȣ ���
		System.out.println("�̸�: " + this.name);
		System.out.println("���� ��ȣ: " + this.cashId);
	}
	
	void setSumMoney(int money) {
		this.money += money;
	}
	
	void setSubMoney(int money) {
		this.money -= money;
	}
	
	int getMoney() {
		return this.money;
	}
	
}