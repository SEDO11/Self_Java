package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog(); // Dog ��ü ����, �ν��Ͻ� ȭ
		Cat cat = new Cat(); // Cat ��ü ����, �ν��Ͻ� ȭ
		
		dog.sound(); // �Ҹ� ���
		cat.sound(); // �Ҹ� ���
		
		Animal animal = null;
		
		animal = new Dog(); // ������
		animalSound(animal); // Dog���� ������ �� �Ҹ� ���
		
		animal = new Cat(); // ������
		animalSound(animal); // Cat���� ������ �� �Ҹ� ���

	}
	
	public static void animalSound(Animal animal) { // ���� �޼���
		animal.sound();
	}

}
