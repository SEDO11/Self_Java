package chap06.sec05.Exam05.Test01;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "ȫ�浿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println();
		
		p1.name = "������";
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		/*
		 * final�� �̿� �����Ƿ� �� �� �Էµ� ���� �ٽ� ������ ���� �ʴ´�.
		p1.ssn = "12345";
		p1.name = "usa";
		*/

	}

}
