package test4;

public class Main {

	public static void main(String[] args) {
		// �ν��Ͻ� ���
		System.out.println("�ν��Ͻ� ���");
		InstanceTest ins1 = new InstanceTest(10);
		InstanceTest ins2 = new InstanceTest(20);
		
		System.out.println(ins1.cal(1, 2)); // 10 + 1 + 2
		System.out.println(ins2.cal(1, 2)); // 20 + 1 + 2
		
		System.out.println();
		
		// ���� ���
		System.out.println("���� ���");
		StaticTest.static_ins = 30;
		System.out.println(StaticTest.cal(1, 2)); // 30 + 1 + 2 
		for(int i=0; i<3; i++) {
			System.out.println(StaticTest.cal(1, 2));
		}
		StaticTest.static_ins = 40;
		System.out.println(StaticTest.cal(1, 2)); // 40 + 1 + 2 
		

	}

}
