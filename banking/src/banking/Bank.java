package banking;

import java.util.*;

public class Bank{

	static Scanner sc = new Scanner(System.in);
    private Account[] accounts;
    private int index;
    boolean run = true;
    private int idNum = 100;
    
    public Bank() { //���»��� ����
        accounts = new Account[idNum];
    }
    
    public static void main(String[] args) {
        Bank sd = new Bank();
        sd.openBank();
    }
    
    public void openBank() {
        System.out.println("�ݰ����ϴ�. SEDO ��ũ�Դϴ�.");
        //User Interface �۾�
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.���»��� |2.���¸�� |3.����   |4.���   |5.�۱�   |6.����   ");
            System.out.println("----------------------------------------------------");
            System.out.print("���� >> ");
            int cmd = sc.nextInt();
            if(cmd==6) {
                System.out.println("��ŷ���񽺸� �����մϴ�.");
                run = false;
            } else if(cmd==1) {
                System.out.print("���¹�ȣ �Է� >> ");
                String accountNo = sc.next();
                System.out.print("������ �Է� >> ");
                String accountOwner = sc.next();
                System.out.print("�Աݾ� �Է� >> ");
                int balance = sc.nextInt();
                boolean idcheck = this.overLapping(accountNo);
                if(idcheck == true) {
                	this.createAccount(new Account(accountNo,accountOwner,balance));
                }
            } else if(cmd==2) {
                this.getAccountList();
            } else if(cmd==3) {
                System.out.print("���¹�ȣ �Է� >> ");
                String accountNo = sc.next();
                System.out.print("�Աݾ� �Է� >> ");
                int balance = sc.nextInt();
                this.deposit(accountNo, balance);
            } else if(cmd==4) {
            	System.out.print("���¹�ȣ �Է� >> ");
                String accountNo = sc.next();
                System.out.print("��ݾ� �Է� >> ");
                int balance = sc.nextInt();
                this.withdraw(accountNo, balance);
            } else if(cmd==5){
            	if(index > 1) { //������ ���°� �� �� �̻��� ��
            		System.out.print("���� ���¹�ȣ �Է� >> ");
                    String accountNo1 = sc.next();
                    System.out.print("���� ���¹�ȣ �Է� >> ");
                    String accountNo2 = sc.next();
                    System.out.print("�۱� �� >>");
                    int balance = sc.nextInt();
                    this.trans(accountNo1, accountNo2, balance);
            	} else {
            		System.out.println("���� ���°� ����� ����� ���� �ʾҽ��ϴ�.");
            	}
            } else {
                System.out.println("�ùٸ� ������ �ƴմϴ�.");
            }
        }
    }
    
    //���»���
    private void createAccount(Account account) {
        System.out.println("------");
        System.out.println("���»���");
        System.out.println("------");
        accounts[index++] = account;
        System.out.println(index+"��° ���°� �����Ǿ����ϴ�.");
    }
    
    //�Ա�
    private void deposit(String accountNo,int amount) {
        System.out.println("------");
        System.out.println("�Ա�");
        System.out.println("------");
        Account account = this.findAccount(accountNo);
        account.setBalance(account.getBalance()+amount);
        System.out.println("������ �����Ǿ����ϴ�.");
    }
    
    //�Ա�, ����� ���� ã��
    private Account findAccount(String accountNo) {
        Account account = null;
        for(int i=0;i<index;i++) {
            if(accountNo.equals(accounts[i].getAccountNo())) {
                account = accounts[i];
                break;
            }
        }
        return account;
    }
    
    //���� ���¹�ȣ�� �ִ��� Ȯ��
    private boolean overLapping(String accountNo) {
    	boolean check = false;
        for(int i=0;i<index;i++) {
            if(accountNo.equals(accounts[i].getAccountNo())) {
            	System.out.println("�̹� ���� ���¹�ȣ�� �ֽ��ϴ�. \n�ٽ� �Է� ���ּ���.");
            	return check;
            }
        }
        check = true;
        return check;
    }
    
    //���
    private boolean withdraw(String accountNo,int amount) {
        System.out.println("------");
        System.out.println("���");
        System.out.println("------");
        Account account = this.findAccount(accountNo);
        if(account.getBalance() >= amount) {
        	account.setBalance(account.getBalance()-amount);
            System.out.println("������ �����Ǿ����ϴ�.");
            return true;
        } else {
        	System.out.println("�ݾ��� �ʰ��˴ϴ�. \n�����Ͽ����ϴ�.");
        	return false;
        }
    }
    
 	//�۱�
    private void trans(String accountNo1, String accountNo2, int amount) {
        System.out.println("------");
        System.out.println("�۱�");
        System.out.println("------");
        this.findAccount(accountNo1);
        boolean check = withdraw2(accountNo1, amount);
        if(check == true) {
        	deposit2(accountNo2, amount);
        	System.out.println("�۱��� �����Ǿ����ϴ�.");
        } else {
        	System.out.println("�ݾ��� �ʰ��˴ϴ�. \n�����Ͽ����ϴ�.");
        }
    }
    
    //�۱� ����
    private void deposit2(String accountNo,int amount) {
        Account account = this.findAccount(accountNo);
        account.setBalance(account.getBalance()+amount);
    }
    
    //�۱� ����
    private boolean withdraw2(String accountNo,int amount) {
        Account account = this.findAccount(accountNo);
        if(account.getBalance() >= amount) {
        	account.setBalance(account.getBalance()-amount);
            return true;
        } else {
        	return false;
        }
    }
    
    //�����ȸ
    private void getAccountList() {
        System.out.println("------");
        System.out.println("�����ȸ");
        System.out.println("------");
        for(int i=0;i<index;i++) {
            System.out.print(accounts[i].getAccountNo()+" ");
            System.out.print(accounts[i].getAccountOwner()+" ");
            System.out.println(accounts[i].getBalance());
        }
    }
}