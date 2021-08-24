package sec08.exam03;

public class Car {
	private String name; // �̸�
	private String number; //��ȣ
	private int width; //��
	private int height; //����
	private int linear; //����
	private double x; //x��ǥ
	private double y; //y��ǥ
	private double tank; //��ũ�뷮
	private double fuelRemain; //��������
	private double fuelEfficiency; //����
	
	Car(String name, String number, int width, int height, int linear, double x , 
			double y, double tank, double fuelEfficiency, double fuelRemain){
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.linear = linear;
		this.x = x;
		this.y = y;
		this.tank = tank;
		this.fuelEfficiency = fuelEfficiency;
		this.fuelRemain = fuelRemain;
	}

	public void getX() {
		System.out.println("���� x��ǥ: " + x);
	}

	public void setXMove(double x) {
		System.out.println("x �������� �����̱�");
		this.x += x;
		this.fuelRemain -= 100;
	}

	public void getY() {
		System.out.println("���� y��ǥ: " + y);
		
	}

	public void setYMove(double y) {
		System.out.println("y �������� �����̱�");
		this.y += y;
		this.fuelRemain -= 100;
	}

	public boolean getFuelRemain() {
		if(this.fuelRemain < 0) {
			this.fuelRemain = 0;
			System.out.println("���� ����> " + this.fuelRemain + " L");
			return false;
		}
		System.out.println("���� ����> " + this.fuelRemain + " L");
		return true;
	}
	
	public void setFuelRemain(double fuelRemain) {
		System.out.println("����");
		this.fuelRemain += fuelRemain;
		if(tank < this.fuelRemain) {
			this.fuelRemain = tank;
			System.out.println("������ �� �Ǿ����ϴ�.");
			System.out.println("�⸧�� �ִ�ġ �Դϴ�.> " + this.fuelRemain + " L");
		} else {
			System.out.println("������ �� �Ǿ����ϴ�.> " + this.fuelRemain + " L");
		}
	}
	
	public void spec() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȣ: " + number);
		System.out.println("��: " + width);
		System.out.println("����: " + height);
		System.out.println("����: " + linear);
		System.out.println("���� x��ǥ: " + x);
		System.out.println("���� y��ǥ: " + y);
		System.out.println("��ũ�뷮: " + tank);
		System.out.println("��������: " + fuelRemain);
		System.out.println("����: " + fuelEfficiency);
	}
	
}