package chap06.sec05.Exam05.test02;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-7654321", "ȫ�浿");
		System.out.println(p1.name + p1.nation + p1.ssn);
		p1.name = "������";
		System.out.println(p1.name + p1.nation + p1.ssn);
	}

}
