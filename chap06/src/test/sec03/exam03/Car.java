package test.sec03.exam03;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model; 
	String color;
	int maxSpeed;
	
	//������
	Car() {
		
	}
	
	// ������ �����ε�
	Car(String model) {
//		this.model = model;
		this(model, "����", 100);
	}
	
	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 150);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
