package sec08.exam01;

public class HumanTester {

	public static void main(String[] args) {
		Human human = new Human();
		
		human.name = "������";
		human.age = 24;
		human.sex = "����";
		human.height = 175;
		human.weight = 70;
		System.out.println("�̸�: " + human.name);
		System.out.println("����: " + human.age);
		System.out.println("����: " + human.sex);
		System.out.println("����: " + human.height);
		System.out.println("ü��: " + human.weight);
	}

}
